#include <stdio.h>

int stack[100],choice=1,n,top,x=1;
void push(void);
void pop(void);
void display(void);

int main()
{
    top=-1;
    printf("Enter the size of the stack: ");
    scanf("%d",&n);

    for(int i; i<=n; i++)
    {
        push();
    }
}

void push()
{
    if(top>=n-1)
    {
        printdata();
    }
    else
    {
        printf(" Enter a value to be pushed:");
        scanf("%d",&x);
        top++;
        stack[top]=x;
    }
}

void printdata() {
    int i;
    for(i=top;i>=0;i--)
    {
        printf("%d\n",stack[i]);
    }
}
