<%@ page import="com.example.model.*" pageEncoding="utf-8" %>
<html>
	<head>
		<title>Bem-vindo</title>
	</head>
	<body>
		<%
			ServletContext ctx = getServletContext();
			AnimeListAttribute list = (AnimeListAttribute)ctx.getAttribute("aniList");
		%>
		
		<h1 align="center">Olá, seja bem-vindo a comunidade <strong>EncoNerd's</strong></h1>
		<h2>
			<%=((String)request.getAttribute("compName"))%> a comunidade agradece
			pela sua participação, esperamos que contribua com artigos, jogos, mangás, animes
			e muito mais. Confira abaixo a lista de downloads de boas vindas que temos para ti.
		<h2>
		
		<h3>Boas vindas:<h3>
		<ul>
			<li>
				<a href="http://localhost:8080/enconerds/Down.do?
						file=/rakudai.mp4&type=video/mp4">
					rakudai-kishi-no-calvery-ep1
				</a>
			</li>
			
			<li>
				<a href="http://localhost:8080/enconerds/Down.do?
						file=/tensei-shitara.mp4&type=video/mp4">
					tensei-shitara-slime-ep1
				</a>
			</li>
			
			<li>...</li>
		</ul>
		
		<br><br>
		<h4>Conteúdos Disponíveis:</h4>
		<ul>
			<li><a href="http://localhost:8080/enconerds/Session.do?
				contentType=Anime">Animes</a>
			</li>
			<li><a href="http://localhost:8080/enconerds/Session.do?
					contentType=Book">Livros</a>
			</li>
			<li><%=list.getAnime()%></li>
			<li><%=list.getAnime()%></li>
			<li><%=list.getAnime()%></li>
			<li><%=list.getAnime()%></li>
		</ul>
		
		<br><br><br>
		Endereço de Email do Desenvolvedor:<br>
		<%=ctx.getInitParameter("devEmail")%>
		
		<%-- Comentário jsp--%>
		<!--Comentário html-->
	</body>
</html>