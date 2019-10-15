
//Credit card handler
 class CreditCardHandler
{
    public List<CreditCard> getCreditCardList()
    {
        try
        {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.CREDITCARD";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            List <CreditCard> creditCardList = new ArrayList<CreditCard>();
            while(rs.next())
            {
                CreditCard creditCard = new CreditCard();


                creditCard.setCreditCardNumber(rs.getString("CREDITCARDNUMBER"));

                creditCardList.add(creditCard);

            }
            return creditCardList;

        }

        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

}

class CreditCard {
  void setCreditCardNumber(String s){ 
      
  }
}

class DbConnection {
  void connect() {
 
 }
}
