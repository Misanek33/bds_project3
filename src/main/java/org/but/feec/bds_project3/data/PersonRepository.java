package org.but.feec.bds_project3.data;

import org.but.feec.bds_project3.api.PersonBasicView;
import org.but.feec.bds_project3.config.DataSourceConfig;
import org.but.feec.bds_project3.exception.DataAccessException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PersonRepository {

    public List<PersonBasicView> getPersonBasicView() {
        try (Connection connection = DataSourceConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT id_person, first_name, surname FROM bds.person ORDER BY id_person ASC");
             ResultSet resultSet = preparedStatement.executeQuery();) {
            List<PersonBasicView> personBasicViewList = new ArrayList<>();
            while (resultSet.next()) {
                personBasicViewList.add(mapToPersonBasicView(resultSet));
            }
            return personBasicViewList;
        } catch (SQLException e) {
            throw new DataAccessException("Person basic view could not be loaded", e);
        }
    }

    private PersonBasicView mapToPersonBasicView(ResultSet rs) throws SQLException {
        PersonBasicView personBasicView = new PersonBasicView();
        personBasicView.setId(rs.getLong("id_person"));
        personBasicView.setName(rs.getString("first_name"));
        personBasicView.setSurname(rs.getString("surname"));
        return personBasicView;
    }


}
