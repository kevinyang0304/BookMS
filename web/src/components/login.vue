<template>
<div>
<el-row :gutter="20">
<el-col :span="8">
  <el-form :model="login" status-icon :rules="rule" ref="login">
    <el-form-item prop="username">
        <el-input prefix-icon="el-icon-user-solid" v-model="login.username"
                  auto-complete="off"/>
    </el-form-item>
    <el-form-item prop="password">
        <el-input prefix-icon="el-icon-key" type="password" v-model="login.password"
                  auto-complete="off"/>
    </el-form-item>
    <el-form-item>
        <el-button class="btn" type="primary" @click="submitForm('login')">登录</el-button>
    </el-form-item>
  </el-form>
</el-col>
</el-row>
</div>
</template>

<script>
  export default {
    name: 'login',
    data() {
      var checkUsername = (rule, value, callback) => {
        if (value == ''){
          callback(new Error("请输入用户名"));
        }else{
          callback();
        }
      };
      var checkPassword = (rule, value, callback) => {
        if (value == ''){
           callback(new Error("请输入密码"));
        }else{
          callback();
        }
      };
      return {
        checked: false,
        token: '',
        login: {
          username: '',
          password: ''
        },
        rule: {
          username: [
            {validator: checkUsername,trigger: 'blur'}
          ],
          password: [
            {validator: checkPassword,trigger: 'blur'}
          ]
        }
      }
      },
     methods: {
    submitForm(login) {
        this.$refs[login].validate((valid) => {
            if (valid) {
                //提交表单
                 let param = new URLSearchParams()
                 param.append('username', this.login.username)
                 param.append('password', this.login.password)
                this.$http.post('/login', param)
                .then(result => {
                  console.log(result)
                    if (result.data == 'home') {
                      this.$router.push({ path: '/home' }); //跳转到home组件中
                    } else {
                        console.log("登录失败");
                        //callback(new Error("请输入密码"));
                        return false;
                    }
                });

            } else {
                console.log('error submit!!');
                return false;
            }
        });
    }
}
    }
  
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>

</style>
