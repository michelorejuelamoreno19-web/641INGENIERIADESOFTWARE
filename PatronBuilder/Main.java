public class Main {
    public static void main(String[] args) {
        
        // Usando ASCII Converter
        Converter ascii = new ConverterASCII();
        Reader reader1 = new Reader("LINE", ascii);
        reader1.parseInput();
        Reader reader2 = new Reader("PARAGRAPH", ascii);
        reader2.parseInput();
        Reader reader3 = new Reader("TABLE", ascii);
        reader3.parseInput();

        System.out.println("--------------------");

        // Usando PDF Converter
        Converter pdf = new PDFConverter();
        Reader reader4 = new Reader("LINE", pdf);
        reader4.parseInput();
        Reader reader5 = new Reader("PARAGRAPH", pdf);
        reader5.parseInput();
        Reader reader6 = new Reader("TABLE", pdf);
        reader6.parseInput();

        System.out.println("--------------------");

        // Usando PostScript Converter
        Converter ps = new PostScriptConverter();
        Reader reader7 = new Reader("LINE", ps);
        reader7.parseInput();
        Reader reader8 = new Reader("PARAGRAPH", ps);
        reader8.parseInput();
        Reader reader9 = new Reader("TABLE", ps);
        reader9.parseInput();
    }
}
