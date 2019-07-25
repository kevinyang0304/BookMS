export default {
  name: 'home',
  data() {
    return {
      checked: false,
      token: '',
      bookInfo: {},
      tableData: [],
      editInfo: {},
      dialogEditVisible: false
    }
  },
  methods: {
    refresh() {
      var book = {}
      this.$http.post('/book/getBook', book)
        .then((res) => {
          this.tableData = res.data
        }).catch(err => {
        console.log(err)
        this.$message.error({message: '数据异常', center: true})
      });
    },
    submitForm() {
      //提交表单
      this.$http.post('/book/saveBook', this.bookInfo)
        .then(res => {
          console.log(res)
          if (res.data) {
            this.refresh();
          } else {
            this.$message.error({message: '插入数据失败', center: true})
          }
        }).catch(err => {
        console.log(err)
        this.$message.error({message: '数据异常', center: true})
      });
    },
    toEditBook(row) {
      this.dialogEditVisible = true
      this.editInfo = Object.assign({}, row);/*由于直接赋值是引用传递，所以先浅拷贝，再赋值*/
    },
    delBook(row) {
      var book = {}
      book.id = row.id
      this.$http.post('/book/deleteBook', book)
        .then(res => {
          console.log(res)
          this.refresh();
        });
    },
    editBook() {
      this.$http.post('/book/updateBook', this.editInfo)
        .then(result => {
          console.log(result)
          this.refresh();
          this.dialogEditVisible = false
        });
    }
  },
  created() {
    this.refresh()
  }
}
