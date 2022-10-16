#include <stdio.h>


code(){

    int p_array[10] = {120,504,132,133,304,112,18,17,38,114};
    int item_code[10] = {0,1,2,3,4,5,6,7,8,9};
    int first=0,last=9,mid,key;

    printf("Enter the item number between[0-9]: ");
    scanf("%d",&key);

    if (key <= 9 && key >=0){

            while(first<=last)
    {
        mid = (first + last)/2;

        if(key==item_code[mid])
        {
            printf("This is the item details\n");
             printf("price of the item: %d\n",p_array[mid]);
             printf("position of the item: %d",mid);
             break;
        }
        if(key<item_code[mid])
        {
            last = mid - 1;

        }
        if(key>item_code[mid])
        {
            first = mid + 1;
        }
    }

    }

    else {
            printf("Invalid code try again");
        }


}

int main()
{
    code();
}
