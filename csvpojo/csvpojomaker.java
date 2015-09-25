import java.util.ArrayList;


public class csvpojomaker {

	public static void main (String[] args){

		//make sure there is the pojoname and at leant one field name
		if(args.length>1){
			StringBuilder builder = new StringBuilder();
			String newline = System.getProperty("line.separator");
			ArrayList<String> cols = new ArrayList<>();

			//pojoname
		    String className=args[0];

		    //useless but i like it
			for(int i=1;i<args.length;i++){
				cols.add(args[i]);
			}

			//start building the pojo
			builder.append(newline);
			builder.append("public class ").append(className).append(" {").append(newline).append(newline);
			for(String c : cols){
				builder.append("    private String ").append(c.toLowerCase()).append(" = null ;").append(newline);
			}
			builder.append(newline);
			builder.append("    public ").append(className).append("() {}").append(newline).append(newline);
			builder.append("    public ").append(className).append("(");
			int size = cols.size();
			for(String c : cols){
				builder.append("String ").append(c);
			    if (--size != 0)
					builder.append(", ");
			}
			builder.append("){").append(newline);
			for(String c : cols){
				builder.append("        this.set").append(c.substring(0,1).toUpperCase()).append(c.substring(1).toLowerCase()).append("(").append(c).append(");").append(newline);
			}
			builder.append("    }").append(newline);
			builder.append(newline);
			for(String c : cols){
				builder.append("    public get").append(c.substring(0,1).toUpperCase()).append(c.substring(1).toLowerCase()).append("(){").append(newline);
				builder.append("        return this.").append(c).append(";").append(newline);
				builder.append("    }");
				builder.append(newline).append(newline);

				builder.append("    public set").append(c.substring(0,1).toUpperCase()).append(c.substring(1).toLowerCase()).append("(String ").append(c).append("){").append(newline);
				builder.append("        this.").append(c).append("=").append(c).append(";").append(newline);
				builder.append("    }").append(newline).append(newline);
			}
			builder.append("}").append(newline);
			System.out.println(builder);
		}

	}
}