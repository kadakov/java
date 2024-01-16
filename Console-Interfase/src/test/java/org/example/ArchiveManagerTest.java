package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveManagerTest {

    @Test
    void readTxtFileFromArchive() {
        String result = ArchiveManager.readStringFromFileInArchive("test_txt.zip", "test.txt");

        String str = """
                4+3
                1-1
                4*5
                20/2*5
                20/(2*5)
                (2/2-1+2)*2
                """;

        assertEquals(str, result);
    }

    @Test
    void readJsonFileFromArchive() {
        String result = ArchiveManager.readStringFromFileInArchive("test_json.zip", "test.json");

        String str = """
                {
                  "MathematicalEquations": [
                    {
                      "equation": "4+3"
                    },
                    {
                      "equation": "1-1"
                    },
                    {
                      "equation": "4*5"
                    },
                    {
                      "equation": "20/2*5"
                    },
                    {
                      "equation": "20/(2*5)"
                    },
                    {
                      "equation": "(2/2-1+2)*2"
                    }
                  ]
                }
                """;

        assertEquals(str, result);
    }

    @Test
    void readXmlFileFromArchive() {
        String result = ArchiveManager.readStringFromFileInArchive("test_xml.zip", "test.xml");

        String str = """
                <?xml version="1.0" encoding="UTF-8" standalone="no"?>
                <MathematicalEquations>
                    <equation>4+3</equation>
                    <equation>1-1</equation>
                    <equation>4*5</equation>
                    <equation>20/2*5</equation>
                    <equation>20/(2*5)</equation>
                    <equation>(2/2-1+2)*2</equation>
                </MathematicalEquations>
                """;

        assertEquals(str, result);
    }
}