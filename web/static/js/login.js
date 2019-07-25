export default {
  data() {
    return {
      checked: false,
      token: '',
      user: {
        username: '',
        password: ''
      }
    }
  },
  methods: {
    submitForm() {
      this.$http.post('/user/getUser', this.user)
        .then(res => {
          console.log(res)
          if (res.data.length != 0) {
            this.$router.push({path: '/home'}); //跳转到home组件中
          } else {
            console.log("登录失败");
            return false;
          }
        }).catch(err => {
        console.log(err)
        this.$message.error({message: '数据异常', center: true})
      });
    }
  }
}
