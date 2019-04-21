package com.chasel.demo.diveinspringboot.web.servlet;//package com.chasel.demo.diveinspringboot.web.servlet;
//
//import javax.servlet.AsyncContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * asyncSupported 开启Servlet异步支持
// *
// * @author XieLongzhen
// * @date 2019/3/24 23:14
// */
//@WebServlet(value = "/my/servlet",asyncSupported = true)
//public class MyServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        super.doGet(req, resp);
//
////        异步Servlet
//        AsyncContext asyncContext = req.startAsync();
//        asyncContext.start(() -> {
//            try {
//                resp.getWriter().println("Hello world");
//                // 异步方式下 主动触发完成
//                asyncContext.complete();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });
//    }
//}
