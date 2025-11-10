class Logic {
    void printTable(int num) {
        int iMult = 1; 
        int iCnt = 0;
        for(iCnt = 1; iCnt <= 10; iCnt++) 
        {
            iMult = num * iCnt; 
            System.out.println(" " + num + " x " + iCnt + " = " + iMult);
        }
        
    }
}

class program17_5 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}