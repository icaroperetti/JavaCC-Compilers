/* Generated By:JavaCC: Do not edit this line. Work.java */
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
public class Work implements WorkConstants {
 public static void main(String args []) throws ParseException
 {
 try
 {
 System.out.println("Lendo arquivo fonte...");
 FileInputStream fis = new FileInputStream(new File("..//Work//src//fonte.txt"));
 Work parser = new Work(fis);
 parser.Start();
 System.out.println("Arquivo fonte processado corretamente!");
 }
 catch (IOException e)
 {
 System.out.println("Falha ao abrir arquivo fonte.");
 System.exit(0);
 }
 }

  final public void Start() throws ParseException {
    trace_call("Start");
    try {
      INSTRUCOES();
      jj_consume_token(0);
    } finally {
      trace_return("Start");
    }
  }

  final public void INSTRUCOES() throws ParseException {
    trace_call("INSTRUCOES");
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMENT:
        case TIPO:
        case LITERALS:
        case WHILE:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case TIPO:
          IDENTIFICADOR();
          break;
        case COMMENT:
          jj_consume_token(COMMENT);
          break;
        case LITERALS:
        case WHILE:
          COMANDO();
          break;
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } finally {
      trace_return("INSTRUCOES");
    }
  }

//---------------DECLARAR V�RIAVEIS ------------------------------------------------
  final public void DECLARAR_VARIAVEL() throws ParseException {
    trace_call("DECLARAR_VARIAVEL");
    try {
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LITERALS:
          jj_consume_token(LITERALS);
          break;
        case VIRGULA:
          jj_consume_token(VIRGULA);
          DECLARAR_VARIAVEL();
          break;
        default:
          jj_la1[2] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LITERALS:
        case VIRGULA:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_2;
        }
      }
    } finally {
      trace_return("DECLARAR_VARIAVEL");
    }
  }

  final public void ATRIBUICAO_VARIAVEL() throws ParseException {
    trace_call("ATRIBUICAO_VARIAVEL");
    try {
      jj_consume_token(VALUES);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case VIRGULA:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_3;
        }
        jj_consume_token(VIRGULA);
        jj_consume_token(LITERALS);
        jj_consume_token(ATRIBUICAO);
        jj_consume_token(VALUES);
      }
    } finally {
      trace_return("ATRIBUICAO_VARIAVEL");
    }
  }

  final public void IDENTIFICADOR() throws ParseException {
    trace_call("IDENTIFICADOR");
    try {
      jj_consume_token(TIPO);
      jj_consume_token(LITERALS);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ATRIBUICAO:
        case VIRGULA:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_4;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case VIRGULA:
          jj_consume_token(VIRGULA);
          DECLARAR_VARIAVEL();
          break;
        case ATRIBUICAO:
          jj_consume_token(ATRIBUICAO);
          ATRIBUICAO_VARIAVEL();
          break;
        default:
          jj_la1[6] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      jj_consume_token(EOL);
    } finally {
      trace_return("IDENTIFICADOR");
    }
  }

//-------WHILE----------------------------------------------------------------------------
  final public void COMANDO() throws ParseException {
    trace_call("COMANDO");
    try {
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case WHILE:
          WHILE();
          break;
        case LITERALS:
          ATRIBUIR();
          break;
        case TIPO:
          IDENTIFICADOR();
          break;
        default:
          jj_la1[7] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case TIPO:
        case LITERALS:
        case WHILE:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_5;
        }
      }
    } finally {
      trace_return("COMANDO");
    }
  }

  final public void WHILE() throws ParseException {
    trace_call("WHILE");
    try {
      jj_consume_token(WHILE);
      EXP_BOOL();
      jj_consume_token(FECHA_PARENTESES);
      jj_consume_token(ABRE_CHAVES);
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case TIPO:
        case LITERALS:
        case WHILE:
          ;
          break;
        default:
          jj_la1[9] = jj_gen;
          break label_6;
        }
        COMANDO();
      }
      jj_consume_token(FECHA_CHAVES);
    } finally {
      trace_return("WHILE");
    }
  }

  final public void ATRIBUIR() throws ParseException {
    trace_call("ATRIBUIR");
    try {
      label_7:
      while (true) {
        jj_consume_token(LITERALS);
        jj_consume_token(ATRIBUICAO);
        EXP_ARITMETICA();
        jj_consume_token(EOL);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LITERALS:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_7;
        }
      }
    } finally {
      trace_return("ATRIBUIR");
    }
  }

  final public void EXP_BOOL() throws ParseException {
    trace_call("EXP_BOOL");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VALUES:
        jj_consume_token(VALUES);
        break;
      case NUMEROS:
        jj_consume_token(NUMEROS);
        break;
      case LITERALS:
        jj_consume_token(LITERALS);
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(OPER_RELACIONAL);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VALUES:
        jj_consume_token(VALUES);
        break;
      case NUMEROS:
        jj_consume_token(NUMEROS);
        break;
      case LITERALS:
        jj_consume_token(LITERALS);
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("EXP_BOOL");
    }
  }

  final public void EXP_ARITMETICA() throws ParseException {
    trace_call("EXP_ARITMETICA");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VALUES:
        jj_consume_token(VALUES);
        break;
      case NUMEROS:
        jj_consume_token(NUMEROS);
        break;
      case LITERALS:
        jj_consume_token(LITERALS);
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(OPER_ARITMETICO);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VALUES:
        jj_consume_token(VALUES);
        break;
      case NUMEROS:
        jj_consume_token(NUMEROS);
        break;
      case LITERALS:
        jj_consume_token(LITERALS);
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("EXP_ARITMETICA");
    }
  }

  /** Generated Token Manager. */
  public WorkTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[15];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x202020,0x202020,0x200000,0x200000,0x0,0x0,0x0,0x202000,0x202000,0x202000,0x200000,0x201000,0x201000,0x201000,0x201000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x40,0x40,0x20,0x20,0x20,0x30,0x30,0x40,0x40,0x40,0x0,0x8,0x8,0x8,0x8,};
   }

  /** Constructor with InputStream. */
  public Work(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Work(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new WorkTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Work(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new WorkTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Work(WorkTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(WorkTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 15; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[39];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 15; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 39; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  private int trace_indent = 0;
  private boolean trace_enabled = true;

/** Enable tracing. */
  final public void enable_tracing() {
    trace_enabled = true;
  }

/** Disable tracing. */
  final public void disable_tracing() {
    trace_enabled = false;
  }

  private void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  private void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  private void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + t.image + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  private void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + t1.image + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

}
