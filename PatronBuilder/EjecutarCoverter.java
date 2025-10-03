public class EjecutarCoverter {
    public static void main(String[] args) {
        //creacion de los objetos de tipo converter 
    Converter objASCII = new ConverterASCII();
    Converter objPostScript = new PostScriptConverter();
    Converter objPDF = new PDFConverter();

    Reader objLector1 = new Reader("LINE", objASCII);
    Reader objLector2 = new Reader("TABLE", objPDF);
    Reader objLector3 = new Reader("PARAGRAPH", objPostScript);



}
    
}
