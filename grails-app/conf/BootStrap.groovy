import billwiz.Bill

class BootStrap {

    def init = { servletContext ->

        //july
        //talktime
        new Bill('416564311', '357429', '25-Jul-2013 11:33:32', 1000).save()
        //data
        new Bill('422665782', '367583', '29-Jul-2013 15:20:13', 749).save()

        //august
        //talktime
        new Bill('466452677', '3974787', '10-Aug-2013 17:13:40', 1000).save()
        //data
        new Bill('482644489', '437823', '29-Aug-2013 13:40:23', 749).save()

        //september
        //talktime
        new Bill('498935639', '763422', '15-Sep-2013 17:20:13', 1000).save()
        //data
        new Bill('516013043', '481303', '23-Sep-2013 16:01:35', 749).save()

        //october
        //talktime
        new Bill('528935345', '499236', '15-Oct-2013 16:10:13', 1000).save()
        //data
        new Bill('549301421', '500753', '18-Oct-2013 11:01:35', 749).save()



    }
    def destroy = {
    }
}
