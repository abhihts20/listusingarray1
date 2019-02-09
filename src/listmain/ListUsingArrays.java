package listmain;

import java.util.Scanner;

//WAP to implement list using array to insert,delete,search,sort to display list.
public class ListUsingArrays
{
    //my list to store elements
    private int[] mylist;
    //indices position to insert and delete
    private int last;
    //create parameterized constructor

    public ListUsingArrays(int[] mylist, int last) {
        this.mylist = mylist;
        this.last = last;
    }
    public void insert(int element)
    {
        if (last<mylist.length-1)
        {
            last++;
            mylist[last]=element;
        }
        else
        {
            System.out.println("List is full");
        }
    }
    public void delete()
    {
        if (last>=0)
        {
            mylist[last]=0;
            last--;
        }
    }
    //Searching first occurence of given element
    public boolean search(int element)
    {
        boolean response=false;
        for (int i=0;i<last;i++)
        {
            response=true;
            break;
        }
        return response;
    }
    public void sort()
    {
        for (int i=0;i<last;i++)
        {
            for (int j=0;j<last;j++)
            {
                if (mylist[j]>mylist[j+1])
                {
                    int temp=mylist[j];
                    mylist[j]=mylist[j+1];
                    mylist[j+1]=temp;
                }
            }
        }
    }
    public void display()
    {
        System.out.println("My List");
        for (int i=0;i<=last;i++)
        {
            System.out.print(mylist[i]+",\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size=s.nextInt();
        int[] mylist1=new int[size];
        int last=-1;
        ListUsingArrays obj=new ListUsingArrays(mylist1,last);
        obj.display();
        obj.insert(205);
        obj.display();
    }
}
