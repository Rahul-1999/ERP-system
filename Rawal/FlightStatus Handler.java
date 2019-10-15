
class FlightStatusHandler {

    public  boolean addFlightStatustoDatabase(FlightStatus obj)
    {

        try
        {



            Connection conn = DbConnection.connect();
            String sql = "INSERT INTO APP.FLIGHTSTATUS VALUES (?,?,?,?)";
            PreparedStatement prepSt = conn.prepareStatement(sql);

            prepSt.setInt(1, obj.getFlightNumber());
            prepSt.setString(2, obj.getArrivalTime());
            prepSt.setString(3, obj.getDepartureTime());
            prepSt.setString(4, obj.getStatus());



            int result = prepSt.executeUpdate();

            if (result > 0)
            {
                return true;

            }

            else
            {
                return false;
            }


        }

        catch (Exception E)
        {
            E.printStackTrace();
            return false;
        }

    }


    public  String displayFlightDatabase (int id)
    {
        try
        {


            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM APP.FLIGHTSTATUS WHERE FLIGHTNO = "+id+"";


            PreparedStatement prepSt = conn.prepareStatement(sql);



            java.sql.Statement stmt= conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            String p="NULL";

            while(rs.next())
            {

                String flightno = rs.getString("FLIGHTNO");
                String arrivaltime = rs.getString("ARRIVALTIME");
                String deptime = rs.getString("DEPARTURETIME");
                String status = rs.getString("FLIGHTSTATUS");



                p = flightno + "                              " + arrivaltime + "                              " + deptime + "                          " + status;


            }

            return p;

        }

        catch (Exception E)
        {
            E.printStackTrace();
            return "not found";
            //return false;
        }


    }