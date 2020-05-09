package com.example.mybatis.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToVarcharTypehandler extends BaseTypeHandler<List<Integer>> {
    //java to jdbc
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<Integer> parameters, JdbcType jdbcType) throws SQLException {
        String collectResult = parameters.stream().map(t -> t.toString()).collect(Collectors.joining(","));
        preparedStatement.setString(i, collectResult);
    }

    //jdbc to java by column name
    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String param = resultSet.getString(s);
        String[] splitResult = param.split(",");
        List<Integer> collectResult = Arrays.stream(splitResult).map(item -> Integer.parseInt(item)).collect(Collectors.toList());
        return collectResult;
    }

    @Override
    public List<Integer> getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public List<Integer> getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
