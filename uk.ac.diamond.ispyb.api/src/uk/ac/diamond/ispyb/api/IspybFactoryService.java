package uk.ac.diamond.ispyb.api;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

/**
 * Factory that builds an ISPyB API object of type {@link T}
 */
public interface IspybFactoryService<T>{
	public T buildIspybApi(String url, Optional<String> username, Optional<String> password, Optional<String> schema) throws SQLException;
	public T buildIspybApi(String url, Properties properties, Optional<String> schema) throws SQLException;
}