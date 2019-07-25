<template>
<div>
<el-row type="flex" justify="center">
<el-col :span="6">
  <el-form label-position="left" lable-width="10px">
    <el-form-item prop="username">
      <el-row :gutter="20">
        <el-col :span="6">
          <label> 用户名：</label>
        </el-col>
        <el-col :span="14">
          <el-input v-model="user.username" class="dialog-input-text" />
        </el-col>
      </el-row>
    </el-form-item>
    <el-form-item prop="password">
      <el-row :gutter="20">
        <el-col :span="6">
          <label> 密码：</label>
        </el-col>
        <el-col :span="14">
          <el-input type="password" v-model="user.password" />
        </el-col>
      </el-row>
    </el-form-item>
    <el-form-item>
      <el-button class="btn" type="primary" @click="submitForm">登录</el-button>
    </el-form-item>
  </el-form> 
</el-col>
</el-row>
</div>
</template>

<script src="../../static/js/login.js">
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
