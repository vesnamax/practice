package domaci;

import java.sql.*;

public class DBBanka {

	String connectionString;
	Connection connection;

	public DBBanka(String connectionString) {
		this.connectionString = connectionString;
	}

	void connect() throws SQLException {
		disconnect();
		connection = DriverManager.getConnection(connectionString);
	}

	private void disconnect() throws SQLException {
		if (connection != null && !connection.isClosed())
			connection.close();

	}

	public void ispisiSveFil_nMesta() throws SQLException {

		try (Connection connection = DriverManager.getConnection(connectionString);
				Statement statement = connection.createStatement()) {
			final ResultSet resultSet = statement
					.executeQuery("SELECT f.IdFil,f.Naziv, m.Naziv FROM Filijala f, Mesto m WHERE m.IdMes=f.IdMes");

			while (resultSet.next()) {

				int IdFil = resultSet.getInt(1);
				String Filijala = resultSet.getString(2);// redni broj kolone
				String Mesto = resultSet.getString(3);

				System.out.println(IdFil + "\t" + Filijala + "\t" + Mesto);
			}

		}

	}

}
