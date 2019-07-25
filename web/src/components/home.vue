<template>
  <div>
    <el-container>
      <el-header height="130px">

        <el-form :model="bookInfo" status-icon>
          <el-row :gutter="20">
            <el-col :span="5">
              <el-form-item prop="date">
                入库日期：
                <el-date-picker
                  placeholder="选择日期"
                  v-model="bookInfo.date"
                  value-format="yyyy-MM-dd"/>
              </el-form-item>
            </el-col>
            <el-col :span="5">
              <el-form-item prop="bookName">
                书籍名称：
                <el-input v-model="bookInfo.bookName"/>
              </el-form-item>
            </el-col>
            <el-col :span="5">
              <el-form-item prop="price">
                价格：
                <el-input v-model="bookInfo.price"/>
              </el-form-item>
            </el-col>
            <el-col :span="5">
              <el-form-item prop="kind">
                分类：
                <el-input v-model="bookInfo.kind"/>
              </el-form-item>
            </el-col>
          </el-row>

          <el-row>
            <el-form-item>
              <el-button size="mini" class="btn" type="primary" @click="submitForm">增加书籍</el-button>
            </el-form-item>
          </el-row>

        </el-form>

      </el-header>


      <el-main>
        <el-table
          :data="tableData"
          stripe
          border
          style="width: 100%">
          <el-table-column
            prop="id"
            label="编号"
            width="180">
          </el-table-column>
          <el-table-column
            prop="date"
            label="入库日期"
            width="180">
          </el-table-column>
          <el-table-column
            prop="bookName"
            label="书籍名称"
            width="180">
          </el-table-column>
          <el-table-column
            prop="price"
            label="价格">
          </el-table-column>
          <el-table-column
            prop="kind"
            label="分类">
          </el-table-column>

          <el-table-column
            label="操作"
            width="100">
            <template slot-scope="scope">
              <el-button @click="toEditBook(scope.row)" type="text" size="small">编辑</el-button>
              <el-button @click="delBook(scope.row)" type="text" size="small">删除</el-button>
            </template>
          </el-table-column>

        </el-table>
      </el-main>
    </el-container>

    <el-dialog title="修改书籍信息" :visible.sync="dialogEditVisible">
      <el-form :model="editInfo">
        <el-form-item label="编号:" label-width=100px>
          <el-input v-model="editInfo.id" :disabled="true"/>
        </el-form-item>
        <el-form-item label="入库日期:" label-width=100px>
          <el-date-picker
            placeholder="选择日期"
            v-model="editInfo.date"
            value-format="yyyy-MM-dd"/>
        </el-form-item>
        <el-form-item label="书籍名称:" label-width=100px>
          <el-input v-model="editInfo.bookName"/>
        </el-form-item>
        <el-form-item label="价格:" label-width=100px>
          <el-input v-model="editInfo.price"/>
        </el-form-item>
        <el-form-item label="分类：" label-width=100px>
          <el-input v-model="editInfo.kind"/>
        </el-form-item>
        <el-button @click="dialogEditVisible = false">取 消</el-button>
        <el-button type="primary" @click="editBook">确 定</el-button>
      </el-form>
    </el-dialog>
  </div>
</template>

<script src="../../static/js/home.js">
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>

</style>
