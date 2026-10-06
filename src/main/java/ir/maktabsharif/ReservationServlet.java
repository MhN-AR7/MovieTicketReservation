package ir.maktabsharif;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.math.BigDecimal;

@WebServlet(name = "ReservationServlet", value = "/reserve")
public class ReservationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerName = req.getParameter("customerName");
        String movieName = req.getParameter("movieName");
        BigDecimal ticketPrice = new BigDecimal(req.getParameter("ticketPrice"));
        int ticketNum = Integer.parseInt(req.getParameter("ticketNum"));

        if (ticketPrice.compareTo(BigDecimal.ZERO) < 0) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid price!");
            return;
        }

        if (ticketNum < 1) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid ticket number!");
            return;
        }

        BigDecimal totalPrice = ticketPrice.multiply(BigDecimal.valueOf(ticketNum));

        double discount = 0;

        if (ticketNum >= 4) {
            discount = 15;
        }

        BigDecimal finalPrice = totalPrice.subtract(totalPrice.multiply(BigDecimal.valueOf(discount/100)));

        req.setAttribute("customerName", customerName);
        req.setAttribute("movieName", movieName);
        req.setAttribute("ticketPrice", ticketPrice);
        req.setAttribute("ticketNum", ticketNum);
        req.setAttribute("totalPrice", totalPrice);
        req.setAttribute("discount", discount);
        req.setAttribute("finalPrice", finalPrice);

        req.getRequestDispatcher("reservation-result.jsp").forward(req, resp);
    }
}
