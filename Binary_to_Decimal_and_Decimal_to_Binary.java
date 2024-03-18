
public class Binary_to_Decimal_and_Decimal_to_Binary {

    Binary_to_Decimal_and_Decimal_to_Binary(){}
    
    int Decimal_to_Binary(int number)
    {
        int Binary[] = new int[100] ;

        int temp = number, i = 0;
        int base = 2;
        while(temp != 0)
        {
            Binary[i] = temp % base;
            temp = temp / 2;
            i++;
        }

        i = 0;
        temp = 0;
        base = 1;
        while(i < Binary.length)
        {
            temp = temp + (Binary[i] * base);
            base *= 10;
            i++;
        }

        return temp;
    }

    int Binary_to_Decimal(int number)
    {
        int temp = number;
        int base = 1;
        int new_number = 0;
        while(temp != 0)
        {
            new_number = new_number + (base * (temp % 10));
            base = base * 2;
            temp = temp / 10;
        }

        return new_number;
    }
    
    public static void main(String[] args) {
        
        Binary_to_Decimal_and_Decimal_to_Binary object = new Binary_to_Decimal_and_Decimal_to_Binary();
        int binary_number = object.Decimal_to_Binary(78);
        int decimal_number = object.Binary_to_Decimal(1001110);

        System.out.println("Binary Number = " + binary_number);
        System.out.println("Decimal Number = " + decimal_number);
    }
}
