#include <stdio.h>
#include <Stdlib.h>
char oddoreven(int no)
{
    if (no%2==0)
    {

        return "E";
    }
    else
    {
       return "O";
    }

}
int main ()
{
    /*int num1 , num2;
    printf("Enter Number 1: ");
    scanf("%d",&num1);
    printf("Enter Number 2: ");
    scanf("%d",&num2);

    fucntion1(num1,num2);

    int size;
    printf("Enter the Array Size: ");
    scanf("%d",&size);

    printf("Max Value: %d",array1(size));

    int base,Ex;
    printf("Enter Base ");
    scanf("%d",&base);
    printf("Enter Exponent ");
    scanf("%d",&Ex);

    printf("Answer : %d",intigerPower(base,Ex)); */

    int num;
    printf("Enter Number: ");
    scanf("%d",&num);

    printf("Your Number is an: %c",oddoreven(num));



}

int fucntion1 (int no1,int no2)
{

    int sum = no1+no2;
    printf("sum : %d",sum);
}


int array1 (int x)
{
    int array[x];
    int count,max;

    for(count=0;count<x;count++)
    {
        printf("Enter the Value: ");
        scanf("%d",&array[count]);

    }

    for(count=0;count<x;count++)
    {
        printf("\n%d\n",array[count]);
    }

    for (count = 1; count < x; count++) {
    if (array[count] > max) {
      max = array[count];
    }
  }

  return max;

}


int intigerPower(int base,int ex)
{
    int ans =1 , count;

    for (count =1;count<=ex;count++)
    {

        ans = ans*base;
        return ans;
    }
}

