package billwiz

class BillController {

    static scaffold = true

    def showBill(Long id) {
        render view: 'bill', model: [billInstance: Bill.get(id)]
    }
}
