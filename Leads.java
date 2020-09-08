import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;
import java.time.*;

public class Leads
{
    //Data Field
    static String name;
    static Date dob;
    static boolean gender;
    static String phone;
    static String email;
    static String address;
    static int n = 000;

    static String[] phoneList = new String[999];
    static String[] emailList = new String[999];
    static String[] addressList = new String[999];
    static String[] nameList = new String[999];
    static Date[] dobList = new Date[999];
    static boolean[] genderList = new boolean[999];



    //Constructor
    /*
    public Leads(String name, Date dob, boolean gender, String phone, String email, String address)
    {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    //Get 'n' Set
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public Date getDob()
    {
        return dob;
    }
    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    public boolean isGender()
    {
        return gender;
    }
    public void setGender(boolean gender)
    {
        this.gender = gender;
    }

    public long getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

     */

    //Method
    public static void leads() throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pls input the requirement: ");

        System.out.print("What is your phone number: ");
        String phone = sc.nextLine();
        phoneList[n+1] = phone;

        System.out.print("What is your email: ");
        String email = sc.nextLine();
        emailList[n+1] = email;

        System.out.print("What is your address: ");
        String address = sc.nextLine();
        addressList[n+1] = address;

        System.out.print("What is your name: ");
        String name = sc.nextLine();
        nameList[n+1] = name;

        System.out.print("When is your birthday(dd-mm-yyyy): ");
        String dob = sc.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date bDay = format.parse(dob);
        System.out.println(format.format(bDay));
        dobList[n+1] = bDay;

        System.out.print("Gender(Just said True or False): ");
        boolean gender = sc.nextBoolean();
        genderList[n+1] = gender;

        System.out.printf("lead_%03d,%s,%td-%tm-%tY,%b,%s,%s,%s%n", n, nameList[n+1], dobList[n+1], dobList[n+1], dobList[n+1], genderList[n+1], phoneList[n+1], emailList[n+1], addressList[n+1]);

        System.out.println();

        //sc.close();
    }

    public static void main(String[] args) throws Exception
    {
        Scanner menu = new Scanner(System.in);
        int mode = -1;

        while(mode != 0)
        {
            System.out.println("Enter 1 to view all current lead");
            System.out.println("Enter 2 to edit lead");
            System.out.println("Enter 0 to exit");

            mode = menu.nextInt();

            if (mode == 1)
            {
                for (int i = 1; i <= 999; i++)
                {
                    if (equals(nameList[i],"0") == true || nameList[i] == null)
                    {
                        break;
                    }
                    else
                    {
                        System.out.printf("lead_%03d,%s,%td-%tm-%tY,%b,%s,%s,%s%n", n, nameList[i], dobList[i], dobList[i], dobList[i], genderList[i], phoneList[i], emailList[i], addressList[i]);
                    }
                }
            }
            else if (mode == 2 )
            {
                Scanner edit = new Scanner(System.in);
                int editMode = -1;

                while (editMode != 0)
                {
                    System.out.println("Enter 1 to delete an existed Lead");
                    System.out.println("Enter 2 to update a Lead");
                    System.out.println("Enter 3 to add Leads");
                    System.out.println("Enter 0 to go back to main menu");
                    editMode = edit.nextInt();

                    if (editMode == 1)
                    {
                        Scanner delete = new Scanner(System.in);
                        System.out.println("Pls, enter the id of the lead you want to delete");
                        int target = delete.nextInt();
                        nameList[target] = null;
                        dobList[target] = null;
                        genderList[target] = false;
                        phoneList[target] = null;
                        emailList[target] = null;
                        addressList[target] = null;
                    }
                    else if (editMode == 2)
                    {
                        Scanner update = new Scanner(System.in);
                        System.out.println("Pls, enter the id of the lead you want to update");
                        int target2 = update.nextInt();

                        System.out.println("Please update the name: ");
                        String newName = update.nextLine();
                        nameList[target2] = newName;

                        System.out.println("Please update the birthdate: ");
                        String newDOB = update.nextLine();
                        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                        Date newBDAY = format.parse(newDOB);
                        dobList[target2] = newBDAY;

                        System.out.println("Please update the gender: ");
                        boolean newGender = update.nextBoolean();
                        genderList[target2] = newGender;

                        System.out.println("Please update the phone number: ");
                        String newPhone = update.nextLine();
                        phoneList[target2] = newPhone;

                        System.out.println("Please update the email: ");
                        String newEmail = update.nextLine();
                        emailList[target2] = newEmail;

                        System.out.println("Please update the address: ");
                        String newAddress = update.nextLine();
                        addressList[target2] = newAddress;
                    }
                    else if (editMode == 3)
                    {
                        Scanner button = new Scanner(System.in);
                        int end = 1;

                        while (end != 0)
                        {
                            System.out.println("Enter 0 to end - Enter 1 to continue");
                            System.out.println("Do you wish to end now ?");
                            end = button.nextInt();
                            if (end == 0)
                            {
                                break;
                            }
                            else
                            {
                                n += 1;
                                leads();
                            }
                        }
                    }
                    else if(editMode == 0)
                    {
                        break;
                    }
                }
            }
            else if(mode == 0)
            {
                break;
            }
        }
    }

    private static boolean equals(String s, String s1)
    {
        if (s == s1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}