    static int particionar (int arr[], int ini, int fin)     {
        int pivote = arr[fin]; 
        int i = (ini-1); // index of smaller element
        for (int j=ini; j<fin; j++)
        {
            // If current element is smaller than or
            // equal to pivote
            if (arr[j] <= pivote)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[fin] (or pivote)
        int temp = arr[i+1];
        arr[i+1] = arr[fin];
        arr[fin] = temp;
 
        return i+1;
    }
