<%-- 
    Document   : inventory
    Created on : Apr 19, 2015, 11:41:01 PM
    Author     : Matthew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />

<t:body-container title="Track IT - Home">
    
    <t:nav-bar iconClass="glyphicon glyphicon-home" username="${username}" />
    
    <div class='container-fluid text-center'>
        
        <h3>Inventory items will go here</h3>
        
    </div>
    
</t:body-container>