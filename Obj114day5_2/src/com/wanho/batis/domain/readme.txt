1.模糊查询，有两个查询条件，tuser表里的username,idcard表里的cardname
2.还有一种情况,pojo类和数据库里表结构不是一一对应
3.如何拼SQL语句
String sql = select* from tuser where 1=1
if(id=null&&!"".equals(id)){
   sql=sql+"and id = "+id;
}
4.foreach遍历多个值
sql里面用到遍历,rowid in(20.30,40,50)
               dept in('dev','man','res')
       查下列学号的学生,信息