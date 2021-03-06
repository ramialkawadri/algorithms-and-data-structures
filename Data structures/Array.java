public class Array<E>
{
    private Object[] values;
    private int size;
    private int length;

    public Array(int size)
    {
        values = new Object[size];
        this.size = size;
        length = 0;
    }

    public Array()
    {
        this(0);
    }

    public E get(int i)
    {
        if (i >= length) throw new IndexOutOfBoundsException();
        return (E) values[i];
    }

    public int length()
    {
        return length;
    }

    public void add(E n)
    {
        if (length >= size)
        {
            size *= 2;
            Object[] temp = new Object[size];

            for (int i = 0; i < length; i++)
            {
                temp[i] = values[i];
            }
            values = temp;
        }
        values[length] = n;
        length++;
    }

    public void delete(int index)
    {
        if (length == 0 || index >= length) throw new 
            IndexOutOfBoundsException();

        for (int i = index + 1; i < length; i++)
        {
            values[i - 1] = values[i];
        }
        length--;
    }

    public void printAll()
    {
        for (int i = 0; i < length; i++)
        {
            System.out.println(values[i]);
        }
    }
}
