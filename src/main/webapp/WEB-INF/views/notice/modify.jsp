<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 수정</title>
</head>
<body>
	<h1>공지사항 수정</h1>
	<form action="/notice/update.do" method="post">
<!-- 	컨트롤러에 No가 필요하니까 hidden으로 만들어줌 -->
	<input type="hidden" name="noticeNo" value="${notice.noticeNo }">  
		<fieldset>
			<legend>공지사항 수정</legend>
			<ul>
				<li>
				<label>제목</label>
				<input type="text" id="" name="noticeSubject" value=${notice.noticeSubject }>
				</li>
				<li>
				<label>내용</label>
				<textarea rows="30" cols="40"  id="" name="noticeContent">${notice.noticeContent }</textarea>
				</li>
			</ul>
		</fieldset>
		<div>
			<input type="submit" value="수정"> 
			<input type="reset"value="초기화">
		</div>
	</form>
</body>
</html>