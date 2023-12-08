public class Printer {
    // two variables of type int, tonerLevel and pagesPrinted. one variable of type boolean, duplex. all are private.
    // toneLevel must be greater than -1 but less or equal to 100, if not meet these conditions, should be intialized to -1.
    // pagesPrinted should be intialized to 0.

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // constructor should accept two parameters, tonerLevel and duplex.
    // if tonerLevel is greater than -1 and less or equal to 100. if it is not, set tonerLevel to -1.

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    // create method addToner, which accepts one parameter, tonerAmount of type int.
    // if tonerAmount is greater than 0 and less or equal to 100, check that tonerAmount plus tonerLevel is less or equal to 100. if it is, set tonerLevel to tonerAmount plus tonerLevel. if not, set tonerLevel to -1.

public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerAmount + this.tonerLevel <= 100) {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            } else {
                return-1;
            }
        } else {
            return -1;
        }
    }

    // create method printPages, which accepts one parameter, pages of type int.
// create variable pagesToPrint, which is equal to the number of pages to print.

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    // create method getPagesPrinted, which returns the number of pages printed.

    public int getPagesPrinted() {
        return pagesPrinted;
    }






}
