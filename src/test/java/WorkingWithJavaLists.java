import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

public class WorkingWithJavaLists {

    @Test

    public void creatingSimpleList(){
        List simplelist = new ArrayList();
        simplelist.add("a String Value");
        simplelist.add(123);
        Assertions.assertThat(simplelist).contains("a String Value", 123);

    }

    @Test

    public void creatingTypeList(){
        List <String> typeList = Arrays.asList("Ned","Tom", "Sally", "Ted", "Jack", "Sally");

        int num = typeList.indexOf("Sally");
        int num2 = typeList.lastIndexOf("Sally");
        Assertions.assertThat(num).isEqualTo(2);
        Assertions.assertThat((num2)).isEqualTo(5);
        List<String> midList = typeList.subList(0,3);
        Assertions.assertThat(midList).contains("Ned");
        int num3 = typeList.size();
        Assertions.assertThat(num3).isEqualTo(6);
        Set<String> setList = new HashSet<>(typeList);
        Assertions.assertThat(setList).containsExactlyInAnyOrder("Ned","Tom", "Sally", "Ted", "Jack");
        Collections.sort(typeList);
        Assertions.assertThat(typeList).containsExactly("Jack", "Ned", "Sally", "Sally", "Ted", "Tom");
        



    }

}
