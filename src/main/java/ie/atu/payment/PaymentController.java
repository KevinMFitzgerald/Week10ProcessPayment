package ie.atu.payment;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @PostMapping
    public String makePayment(@RequestBody Person person)
    {
        return "got person "+person;
    }

}

