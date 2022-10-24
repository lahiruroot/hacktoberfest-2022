#include<stdio.h>
int main()
{
    int data[10] = {100,101,102,103,104,105,106,107,108,109};

    int k,mid,first=0,last=9;

    printf("Enter key to search: ");
    scanf("%d",&k);

    while(first<=last)
    {
        mid=(first+last)/2;
        if(k==data[mid]){
            printf("Data found at %d\n", mid);
            break;}
        if(k<data[mid])
            last=mid-1;

        if(k>data[mid])
            first=mid+1;
    }
    return 0;
}
