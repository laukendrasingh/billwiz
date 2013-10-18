package billwiz

import com.billwiz.TransactionType

class Bill {
    String receiptNo
    String mobile
    TransactionType transactionType = TransactionType.Recharge
    String referenceNumber
    String rechargeTime
    Integer amountPaid


    Bill(String receiptNumber, String referenceNo, String time, Integer amount) {
        receiptNo = receiptNumber
        referenceNumber = referenceNo
        mobile = '9999363368'
        transactionType = TransactionType.Recharge
        rechargeTime = time
        amountPaid = amount
    }
}
