<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card my-5">
		<h3 class="card-header">FORM BASIC-SCORE</h3>
		<p style="text-align:center;"><img src="" alt="이미지가 없습니다."></p>
		<form action="jsp009_score_result.jsp" method="post">
			<div class="my-3">
				<label for="kor" class="form-label">KOR :</label>
				<input type="number" class="form-control" id="kor" name="kor" min="0" max="100" value="0" />
				<label for="eng" class="form-label">ENG :</label>
				<input type="number" class="form-control" id="eng" name="eng" min="0" max="100" value="0" />
				<label for="math" class="form-label">MATH :</label>
				<input type="number" class="form-control" id="math" name="math" min="0" max="100" value="0" />
			</div>
			<div class="my-3" style="text-align:right">
			<input type="submit" class="btn btn-success" title="성적처리 하러가기" value="성적처리">
			</div>
		</form>
	</div>
</body>
</html>