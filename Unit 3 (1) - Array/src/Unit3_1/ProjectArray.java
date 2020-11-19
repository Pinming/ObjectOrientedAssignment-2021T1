package Unit3_1;

/**
 * This class contains methods to process arrays of {@link Project} objects.
 *
 * @author  author name
 * @version  1.0.0
 * @see  Project
 */
public class  ProjectArray  {

	/**
	 * Creates an array with three objects of class {@link Project}.
	 * <p>
	 * The first element of the array is the object
	 * <code>first</code>, the second element of the array is
	 * the object <code>second</code>, and  the third element of the
	 * array is the object <code>third</code>.
	 * </p>
	 *
	 * @param first  a {@link Project} object.
	 * @param second  a {@link Project} object.
	 * @param third  a {@link Project} object.
	 * @return  an array with the objects <code>first</code>,
	 *           <code>second</code>, and <code>third</code>.
	 */
	public static Project[] makeArray(Project  first, Project  second,
	                                   Project  third)  {
		Project[] projects = new Project[3];
		projects[0] = first;
		projects[1] = second;
		projects[2] = third;
		/* PLACE YOUR CODE HERE */
		return projects; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Creates a new array from the specified array of {@link Project}
	 * objects.
	 * <p>
	 * The elements in the new array have the same order as those in
	 * the specified array.
	 * </p>
	 *
	 * @param array  an array that contains objects of class {@link Project}.
	 * @return  a <i>new</i> array of the objects in the specified array.
	 */
	public static Project[] copyArray(Project[]  array)  {
		Project[] projectsCopied = array.clone();
		return projectsCopied;
	}


	/**
	 * Returns the {@link Project} object with the specified ID.
	 *
	 * @param array  an array that contains objects of class {@link Project}.
	 * @param id  an Project ID.
	 * @return  The {@link Project} object with the specified
	 *          ID. Returns <code>null</code> if there are no Projects
	 *          in the specified array with the specified ID.
	 */
	public static Project getProject(Project[]  array, int id)  {
		for (int i = 0; i < array.length; i++){
			if (id == array[i].getId()){
				return array[i];
			}
		}
		return null; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Returns the number of Projects whose price is Lower than the specified
	 * dollar amount.
	 *
	 * @param array  an array that contains objects of class {@link Project}.
	 * @param amount  a dollar amount.
	 * @return  the number of Projects whose price is Lower than the
	 *          specified dollar amount.
	 */
	public static int countLowerPrice(Project[]  array, double amount) {
		int cnt = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].getPrice() < amount) {
				cnt++;
			}
		}
		return cnt;
	}

	/**
	 * Returns the sum of the price of the Projects in the specified
	 * array.
	 *
	 * @param array  an array that contains objects of class {@link Project}.
	 * @return  the sum of the price of the Projects in the specified
	 *          array.
	 */
//	for-each loop
	public static double sumPrice(Project[]  array)  {
		double sum = 0;
		for (int i = 0; i < array.length; i++)	{
			sum = sum + array[i].getPrice();
		}
		/* PLACE YOUR CODE HERE */
		return sum; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Obtains the Lowest price in the specified array.
	 *
	 * @param array  an array that contains objects of class {@link Project}.
	 * @return  the Lowest price in the specified array.
	 */
	
//	for-each loop
	public static double getLowestPrice(Project[]  array)  {
		double lowestPrice = array[0].getPrice();
		for (int i = 1; i < array.length; i++)	{
			if(array[i].getPrice() < lowestPrice){
				lowestPrice = array[i].getPrice();
			}
		}
		/* PLACE YOUR CODE HERE */
		return lowestPrice; // REMOVE; USED SO THIS FILE COMPILES
	}

	/**
	 * Increases the Price of every Project in the specified array by the
	 * specified amount.
	 *
	 * @param array  an array that contains objects of class {@link Project}.
	 */
//	for-each loop
	public static void increaseAll(Project[] array, double amount)  {
		for (int i = 0; i < array.length; i++){
			array[i].setPrice(array[i].getPrice() + amount);
		}
	}

	/**
	 * Returns a string representation of the specified
	 * {@link Project} array.
	 * <p>
	 * Uses the method <code>toString</code> in class <code>Project</code>
	 * to obtain the string representation of each object in the array.
	 * </p>
	 * A new line character ( \n ) separates the string representations
	 * of each <code>Project</code> object. For example:
	 * </p>
	 * <pre>
	 * Project[102,cruise,68250.0]\n
	 * Project[101,domestic,36000.0]\n
	 * Project[103,outbound,92175.0]
	 * </pre>
	 * <p>
	 * Note that the string returned does <i>not</i> end with a new line
	 * character (\n).
	 * </p>
	 * <p>
	 * This method assumes that every element in the specified array
	 * contains a valid reference to an <code>Project</code> object.
	 * </p>
	 *
	 * @param array  an array that contains objects of class {@link Project}.
	 * @return  the string representation of the specified array
	 */
	public static String displayAll(Project[]  array)  {
		String str = "";
		for (int i = 0; i < array.length; i++){
			String t;
			if (i < array.length - 1) {
				t = "\n";} else {
				t = "";}
			str = str + array[i] + t;
		}
//		System.out.println("str:" + str);
		/* PLACE YOUR CODE HERE */
		return str; // REMOVE; USED SO THIS FILE COMPILES
	}
}