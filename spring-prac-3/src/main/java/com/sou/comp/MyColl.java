package com.sou.comp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyColl {
private String myArr[];
private List<String> myList;
private Set<String> mySet;
private Map<String,String> myMap;
private Properties myProps;
public String[] getMyArr() {
	return myArr;
}
public void setMyArr(String[] myArr) {
	System.out.println("Arr method is Called");
	this.myArr = myArr;
}
public List<String> getMyList() {
	return myList;
}
public void setMyList(List<String> myList) {
	System.out.println("List is called");
	this.myList = myList;
}
public Set<String> getMySet() {
	return mySet;
}
public void setMySet(Set<String> mySet) {
	this.mySet = mySet;
	System.out.println("Set is called");
}
public Map<String, String> getMyMap() {
	return myMap;
}
public void setMyMap(Map<String, String> myMap) {
	this.myMap = myMap;
	System.out.println("Map is called");
}
public Properties getMyProps() {
	return myProps;
}
public void setMyProps(Properties myProps) {
	this.myProps = myProps;
	System.out.println("Properties method is called");
}

}
