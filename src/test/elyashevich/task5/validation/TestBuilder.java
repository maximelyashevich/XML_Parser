package test.elyashevich.task5.validation;

import com.elyashevich.task5.builder.AbstractPaperBuilder;
import com.elyashevich.task5.builder.PaperBuilderFactory;
import com.elyashevich.task5.entity.Magazine;
import com.elyashevich.task5.entity.MagazineCharacter;
import com.elyashevich.task5.marshaller.PaperEditionMarshal;
import com.elyashevich.task5.marshaller.PaperEditionUnMarshal;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuilder {
        private static final String FILE_PATH = "text\\test.xml";
        private static final String EMPTY_FILE_PATH = "text\\empty.xml";
        private static final String TEXT_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<papers xmlns=\"http://www.example.com/papers\">\n" +
                "    <magazine id=\"ID-8\" category=\"fashion\">\n" +
                "        <title>Cosmopolitan</title>\n" +
                "        <monthly>true</monthly>\n" +
                "        <magazine-chars>\n" +
                "            <color>true</color>\n" +
                "            <volume>65</volume>\n" +
                "            <glossiness>true</glossiness>\n" +
                "            <subscription-index>51284</subscription-index>\n" +
                "        </magazine-chars>\n" +
                "    </magazine>\n" +
                "</papers>";
        private static Magazine expected;
        private static PaperEditionUnMarshal paperEditionUnMarshal ;
        private static PaperEditionMarshal paperEditionMarshal;
        private static PaperBuilderFactory sFactory;
        private static File file;
        private static final String DOM = "dom";
        private static final String SAX = "sax";
        private static final String STAX = "stax";
        @BeforeSuite
        public static void initBuilderComponents(){
                sFactory = new PaperBuilderFactory();
                paperEditionUnMarshal = new PaperEditionUnMarshal();
                paperEditionMarshal = new PaperEditionMarshal();
                expected = new Magazine("Cosmopolitan", true, "ID-8", "fashion", new MagazineCharacter(true, 65, true, 51284));
        }
        @BeforeClass
        public static void initFileComponents() throws IOException {
                file = new File(FILE_PATH);
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(TEXT_XML);
                fileWriter.close();
        }

        @Test
        public void testDOMBuilder(){
                AbstractPaperBuilder builder = sFactory.createStudentBuilder(DOM);
                builder.buildSetPaperEdition(file.getPath());
                Magazine result = (Magazine) builder.getPapers().iterator().next();
                Assert.assertEquals(expected, result);
        }

        @Test
        public void testSTAXBuilder(){
                AbstractPaperBuilder builder = sFactory.createStudentBuilder(STAX);
                builder.buildSetPaperEdition(file.getPath());
                Magazine result = (Magazine) builder.getPapers().iterator().next();
                Assert.assertEquals(expected, result);
        }
        @Test
        public void testSAXBuilder(){
                AbstractPaperBuilder builder = sFactory.createStudentBuilder(SAX);
                builder.buildSetPaperEdition(file.getPath());
                Magazine result = (Magazine) builder.getPapers().iterator().next();
                Assert.assertEquals(expected, result);
        }

        @Test
        public void testMarshal(){
                paperEditionMarshal.marshalingData(EMPTY_FILE_PATH);
                Magazine result = (Magazine)  paperEditionUnMarshal.buildPaperListEdition(EMPTY_FILE_PATH).getPaperEdition().get(8);
                Assert.assertEquals(expected, result);
        }
        @AfterClass
        public void deleteFile() {
                file.delete();
                paperEditionUnMarshal = null;
                paperEditionMarshal = null;
        }

}
