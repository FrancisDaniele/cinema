<%@ page import="java.util.Iterator"%>
<%@ page import="java.time.LocalDate"%>
<%@ page import="com.cinema.dto.Genere" %>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.cinema.dto.Film"%>
<%@ page errorPage="error/error-page.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.cinema.service.FilmService" %>

<%-- 
Aquesta pàgina mostrarà la llista de pel·lícules i filtrarà per gènere

--%>

<%-- Bloc de declaracions de variables i mètodes --%>
<%!
    
   
    private static final int NUM_FILM = 5;// màxim de pel·lícules a mostrar

    // Mètode per filtrar per genere
    private Map<Integer, Film> getFilmsPerGenere(Genere genere, Map<Integer, Film> llista) {
        if (genere==null){
            return llista; //Tornam totes els films.
        }else{
        	Map <Integer, Film> films = new HashMap <Integer, Film> ();
        	
            for (Map.Entry<Integer, Film> entry : llista.entrySet()) {
                if (genere.equals(entry.getValue().getGenere()))
                    films.put(entry.getKey(), entry.getValue());            
            }
            return films;
        }
    }



%>
<%
	FilmService serveiFilm = new FilmService();
	HashMap<Integer, Film> llistaFilms = serveiFilm.getLlistaFilms();
	       
    String pGenere = request.getParameter("genere");
    Genere genere = null;
    if(pGenere!=null){
    	genere = Genere.valueOf(pGenere);
    }
    System.out.println("genere:"+pGenere);
    Map<Integer, Film> llistaFilmsFiltrada= getFilmsPerGenere(genere, llistaFilms);
    request.setAttribute("llistaFilmsFiltrada", llistaFilmsFiltrada);  
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
    <%-- Enllaços cagegories/genere--%>
    <nav>
         <a href="llista_films.jsp?genere=CIENCIA_FICCIO">Ciència ficció</a> |
         <a href="llista_films.jsp?genere=AVENTURES">Aventures</a> 
         <a href="llista_films.jsp?genere=DRAMA">Drama</a> |
         <a href="llista_films.jsp?genere=TERROR">Terror</a> |
         <a href="llista_films.jsp?genere=INFANTIL">Infantil</a> |
    </nav>
    
    <%-- Mostrar llista pel·lícules per gènere --%>
    <ul>

        
        <%-- Mostrar màxim les pel·lícules de NUM_FILM --%>
        <c:set var="NUM_FILM" value="5" scope="page" />
        <c:forEach var="film" varStatus="loop" items="${llistaFilmsFiltrada}">
            <c:if test = "${loop.index < NUM_FILM}">
            <li><a href="detall_film.jsp?codi=<c:out value="${film.key}"/>">
                    <c:out value="${film.value.nom}"/>
                </a>
            </li>
            </c:if>
        </c:forEach>
            
    </ul>
<%@include file="footer.jsp" %>