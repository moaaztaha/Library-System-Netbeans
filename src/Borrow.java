import java.io.Serializable;

public class Borrow implements Serializable{
    static final long serialVersionUID = 41L;
    private int isbn;
    private String name;
    private int id;
    private boolean returned;
    private String startDate;
    private String endDate;
    private double fines;
    private String type;

    public Borrow(int isbn, String name, int id, String startDate, String type) {
        this.isbn = isbn;
        this.name = name.toLowerCase();
        this.id = id;
        this.startDate = startDate;
        this.returned = false;
        this.startDate = startDate;
        this.calcEndDate(startDate);
        this.type = type.toUpperCase();
    }
    
    void setTypee(String type)
    {
    	this.type = type.toUpperCase();
    }
    
    String getType()
    {
    	return this.type;
    }

    void returned() {
        this.returned = true;
    }

    boolean checkStatus() {
        return returned;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String bBookName) {
        this.name = bBookName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
    	String condition; // Added the condition part to toString method by Moaz
    	if (returned)
    		condition = "the book has been returned.";
    	else
    		condition = "the book has not returned yet!!";
        return String.format("The Book: %s With ISBN : %d \n Is borrowed by the %s id: %d \n on %s And should be returned on %s and %s", getName(), getIsbn(), type, getId(), getStartDate(), getEndDate(), condition
        		);
    }

    public boolean equals(Borrow obj) {
        return name.equals(obj.name.toLowerCase());
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setFines(double fines) {
        this.fines = fines;
    }

    public double getFines(String date) {
        finesPending(date);
        return fines;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void calcEndDate(String start) {
        int newDay, endDay, endMonth, endYear;
        int startDay = Integer.parseInt(start.substring(0, 2));
        int startMonth = Integer.parseInt(start.substring(3, 5));
        int startYear = Integer.parseInt(start.substring(6, 10));

        if (startMonth == 1 || startMonth == 3 || startMonth == 5 || startMonth == 7 || startMonth == 8 || startMonth == 10) {
            newDay = startDay + 7;
            if (newDay > 31) {
                endMonth = startMonth + 1;
                endDay = newDay - 31;
                endYear = startYear;
            } else {
                endMonth = startMonth;
                endDay = newDay;
                endYear = startYear;
            }

        } else if (startMonth == 4 || startMonth == 6 || startMonth == 9 || startMonth == 11) {
            newDay = startDay + 7;
            if (newDay > 30) {
                endMonth = startMonth + 1;
                endDay = newDay - 30;
                endYear = startYear;
            } else {
                endMonth = startMonth;
                endDay = newDay;
                endYear = startYear;
            }
        } else {
            newDay = startDay + 7;
            if (newDay > 28) {
                endMonth = startMonth + 1;
                endDay = newDay - 28;
                endYear = startYear + 1;
            } else {
                endMonth = startMonth;
                endDay = newDay;
                endYear = startYear;
            }
        }
        if (endMonth < 10) {
            if (endDay < 10) {
                endDate = "0" + endDay + "/" + "0" + endMonth + "/" + endYear;
            } else {
                endDate = endDay + "/" + "0" + endMonth + "/" + endYear;
            }
        } else if (endMonth >= 10) {
            if (endDay >= 10) {
                endDate = endDay + "/" + endMonth + "/" + endYear;
            } else {
                endDate = "0" + endDay + "/" + endMonth + "/" + endYear;
            }
        }
    }

    public boolean finesPending(String date) {
        //String date;
        double totalfine;
        int totalDays = 0;
        int yearDiff;
        int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //System.out.println("Enter today's date in the format DD/MM/YY");
        //date = input.nextLine();
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 10));

        int dueDay = Integer.parseInt(endDate.substring(0, 2));
        int dueMonth = Integer.parseInt(endDate.substring(3, 5));
        int dueYear = Integer.parseInt(endDate.substring(6, 10));

        yearDiff = year - dueYear;

        if (year == dueYear) {
            if (month == dueMonth) {
                if (day < dueDay) {

                    setFines(0);
                    return true;
                } else if (day == dueDay) {

                    setFines(0);
                    return true;
                } else {
                    totalDays += day - dueDay;
                    totalfine = totalDays * 4;
                    setFines(totalfine);
                    return true;
                }

            } else {
                if (month > dueMonth) {

                    for (int i = dueMonth + 1; i < month; i++) {
                        switch (i) {
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                totalDays += 31;
                                break;
                            case 4:
                            case 6:
                            case 9:
                            case 11:
                                totalDays += 30;
                                break;
                            case 2:
                                totalDays += 28;
                        }
                    }

                    totalDays = (daysOfMonth[dueMonth - 1] - dueDay) + totalDays + day;
                    totalfine = totalDays * 4;
                    setFines(totalfine);

                    return true;

                } else if (month < dueMonth) {

                    setFines(0);
                    return true;
                }
                
                else return false;

            }

        } else if (year > dueYear) {
            if (yearDiff == 1) {
                if (month == dueMonth) {
                    totalDays = (365 - dueDay + day);
                    totalfine = totalDays * 4;
                    setFines(totalfine);
                } else {
                    for (int i = (dueMonth + 1) % 12; i < month + 10; i++) {

                        if (i == month) {
                            break;
                        }

                        switch (i) {
                            case 0:
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                totalDays += 31;
                                break;
                            case 4:
                            case 6:
                            case 9:
                            case 11:
                                totalDays += 30;
                                break;
                            case 2:
                                totalDays += 28;
                        }

                    }
                    totalDays = (daysOfMonth[dueMonth - 1] - dueDay) + totalDays + day;
                    totalfine = totalDays * 4;
                    setFines(totalfine);

                    return true;
                }

            }

        }
        return false;
    }

    public void renew() {
        calcEndDate(endDate);
    }
}