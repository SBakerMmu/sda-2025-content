package dipAbstractExample;

interface AbstractCreditCardService {

    void takePayment(double amount, String cardNumber, int expiryYear, int expiryMonth);
}
