// AUTO-GENERATED FILE PLEASE DO NOT MODIFY MANUALLY
package ai.greycat;
@SuppressWarnings({"unused", "unchecked"})
public final class project_lib extends ai.greycat.GreyCat.Library {
	public static final java.lang.String name = "project_lib";
	@Override
	public String name() {
		return name;
	}
	public static final class project {
		public static final class Hello extends GreyCat.Object {
			public static final java.lang.String name = "project.Hello";
			private Hello(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double b(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_b(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static Hello create(ai.greycat.GreyCat greycat, java.lang.Double b){
				return new Hello(greycat.libs_by_name.get(ai.greycat.project_lib.name).mapped[0], b);
			}
		}
		public static java.lang.Object rpc_bin(ai.greycat.GreyCat greycat,java.lang.Long b) throws java.io.IOException {
			return (java.lang.Object) ai.greycat.GreyCat.call(greycat,"project.rpc_bin", b);
		}
		public static ai.greycat.std.core.Table table(ai.greycat.GreyCat greycat) throws java.io.IOException {
			return (ai.greycat.std.core.Table) ai.greycat.GreyCat.call(greycat,"project.table");
		}
		public static ai.greycat.GreyCat.Task long_task(ai.greycat.GreyCat greycat) throws java.io.IOException {
			return new ai.greycat.GreyCat.Task((Long)ai.greycat.GreyCat.call(greycat,"project.long_task"));
		}
	}
	@Override
	public void configure(java.util.Map<String, ai.greycat.GreyCat.Loader> loaders, java.util.Map<String, ai.greycat.GreyCat.Factory> factories) {
		factories.put(project.Hello.name, project.Hello::new);
	}
	@Override
	public void init(ai.greycat.GreyCat greycat) {
		this.mapped = new ai.greycat.GreyCat.Type[1];
		this.mapped[0] = greycat.types_by_name.get(project.Hello.name);
		this.mapped[0].resolveGeneratedOffsets("b");
	}
}
