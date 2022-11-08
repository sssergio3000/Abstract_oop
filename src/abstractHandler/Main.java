package abstractHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileType;
        String opType;
        System.out.println("Input your file type (DOC, TXT, XML): ");
        fileType = scan.nextLine();
        System.out.println("Input the operation (open, create, change, save): ");
        opType = scan.nextLine();
        if (fileType.equals("DOC")) {
            if (opType.equals("open")) {
                DOCHandler dc = new DOCHandler();
                dc.open();
            }
            if (opType.equals("create")) {
                DOCHandler dc = new DOCHandler();
                dc.create();
            }
            if (opType.equals("change")) {
                DOCHandler dc = new DOCHandler();
                dc.change();
            }
            if (opType.equals("save")) {
                DOCHandler dc = new DOCHandler();
                dc.save();
            }

//
        }//if

        if (fileType.equals("TXT")) {
            if (opType.equals("open")) {
                TXTHandler dc = new TXTHandler();
                dc.open();
            }
            if (opType.equals("create")) {
                TXTHandler dc = new TXTHandler();
                dc.create();
            }
            if (opType.equals("change")) {
                TXTHandler dc = new TXTHandler();
                dc.change();
            }
            if (opType.equals("save")) {
                TXTHandler dc = new TXTHandler();
                dc.save();
            }

//
        }//if
        if (fileType.equals("XML")) {
        if (opType.equals("open")) {
            XMLHandler dc = new XMLHandler();
            dc.open();
        }
        if (opType.equals("create")) {
            XMLHandler dc = new XMLHandler();
            dc.create();
        }
        if (opType.equals("change")) {
            XMLHandler dc = new XMLHandler();
            dc.change();
        }
        if (opType.equals("save")) {
            XMLHandler dc = new XMLHandler();
            dc.save();
        }

//
    }//if


    }//main
}//Main
