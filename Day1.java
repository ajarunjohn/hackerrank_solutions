        /* Declare second integer, double, and String variables. */
           int i1;
           double d1;
           String s1 = new String();
        /* Read and save an integer, double, and String to your variables.*/
            i1 = scan.nextInt();
            d1 = scan.nextDouble();
            while(scan.hasNext()){
                     s1 = scan.nextLine();
 }
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
            int i2 = i + i1;
                System.out.println(i2);
        /* Print the sum of the double variables on a new line. */
		      double d2 = d + d1;
                System.out.println(d2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            String s2 = s + s1;
                System.out.println(s2);
