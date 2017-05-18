<%@ page language="java" contentType="text/html;charset=UTF-8"

         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTDHTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>main</title>

    <!-- Bootstrap -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- <link rel="stylesheet" type="text/css" href="css/index.css"> -->
    <link rel="stylesheet" type="text/css" href="css/rightmain.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-3 col-md-4 col-sm-6 illu">
            <dl>
                <dt>我的个人信息</dt>
                <dd>
                    <ul>
                        <li>你好,${mainpage.userName}</li>
                        <li>上次登录时间：${mainpage.userLastLoginTime}</li>
                    </ul>
                </dd>
            </dl>

        </div>
        <div class="col-lg-3 col-md-4 col-sm-6 illu">
            <dl>
                <dt>信息统计</dt>
                <dd>
                    <ul>
                        <li>座位总数,${mainpage.allDeskNumber}</li>
                        <li>当前可用座位,${mainpage.leftDeskNumber}</li>
                        <li>当前已预约座位,${mainpage.deskNumber}</li>
                    </ul>
                </dd>
            </dl>
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6 illu">
            <dl>
                <dt>预定信息</dt>
                <dd>
                    <ul>
                        <li>程序版本：V1.0 [20150610]</li>
                        <li>操作系统：WINNT</li>
                        <li>服务器软件：Apache/2.4.10 (Win32) OpenSSL/0.9.8zb mod_fcgid/2.3.9</li>
                        <li>MySQL 版本：5.5.40</li>
                        <li>上传文件：2M</li>
                    </ul>
                </dd>
            </dl>
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6 illu">
            <dl>
                <dt>预订须知</dt>
                <dd>
                    <ul>
                        <li>去你妈的</li>
                        <li>官方网站：http://www.mycodes.net</li>
                        <li>官方论坛：http://bbs.xxx.com</li>
                    </ul>
                </dd>
            </dl>
        </div>
    </div>
    <!-- 第一行结束 -->

</div>
<!-- 整个容器结束 -->
<script src="../public/js/jquery-3.1.1.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    //alert($)
</script>
</body>
</html>