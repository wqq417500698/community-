<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="layui/css/layui.css">
<script src="layui/layui.all.js"></script>
<script src="js/jquery-2.1.1.js"></script>
</head>
<body>

<table id="demo" lay-filter="test"></table>
<script src="layui/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
             ,height: 600 
            ,url: '${pageContext.request.contextPath }/findall.action' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', sort: true, fixed: 'left'}
                ,{field: 'name', title: '订单'}
                ,{field: 'price', title: '价格', sort: true}
                ,{field: 'dates', title: '时间'}
                ,{field: 'users', title: '用户'}
               
            ]]
        });

    });
</script>
</body>
</html>