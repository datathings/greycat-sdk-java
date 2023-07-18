// AUTO-GENERATED FILE PLEASE DO NOT MODIFY MANUALLY
package ai.greycat;
@SuppressWarnings({"unused", "unchecked"})
public final class network extends ai.greycat.GreyCat.Library {
	public static final java.lang.String name = "network";
	@Override
	public String name() {
		return name;
	}
	public static final class keycloak {
		public static final class KeycloakRealm extends GreyCat.Object {
			public static final java.lang.String name = "keycloak::KeycloakRealm";
			private KeycloakRealm(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String host(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_host(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String realm(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_realm(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String client_id(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_client_id(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.String client_secret(){
				return (java.lang.String)super.get(super.type.generated_offsets[3]);
			}
			public void set_client_secret(java.lang.String v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.String public_key(){
				return (java.lang.String)super.get(super.type.generated_offsets[4]);
			}
			public void set_public_key(java.lang.String v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static KeycloakRealm create(ai.greycat.GreyCat greycat, java.lang.String host, java.lang.String realm, java.lang.String client_id, java.lang.String client_secret, java.lang.String public_key){
				return new KeycloakRealm(greycat.libs_by_name.get(ai.greycat.network.name).mapped[0], host, realm, client_id, client_secret, public_key);
			}
		}
	}
	public static final class smtp {
		public static final class SmtpConfig extends GreyCat.Object {
			public static final java.lang.String name = "smtp::SmtpConfig";
			private SmtpConfig(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String host(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_host(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long port(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_port(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.network.smtp.SmtpMode mode(){
				return (ai.greycat.network.smtp.SmtpMode)super.get(super.type.generated_offsets[2]);
			}
			public void set_mode(ai.greycat.network.smtp.SmtpMode v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.network.smtp.SmtpAuthMode authenticate(){
				return (ai.greycat.network.smtp.SmtpAuthMode)super.get(super.type.generated_offsets[3]);
			}
			public void set_authenticate(ai.greycat.network.smtp.SmtpAuthMode v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.String user(){
				return (java.lang.String)super.get(super.type.generated_offsets[4]);
			}
			public void set_user(java.lang.String v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.String pass(){
				return (java.lang.String)super.get(super.type.generated_offsets[5]);
			}
			public void set_pass(java.lang.String v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Long debug_level(){
				return (java.lang.Long)super.get(super.type.generated_offsets[6]);
			}
			public void set_debug_level(java.lang.Long v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.String client_key_path(){
				return (java.lang.String)super.get(super.type.generated_offsets[7]);
			}
			public void set_client_key_path(java.lang.String v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.String client_crt_path(){
				return (java.lang.String)super.get(super.type.generated_offsets[8]);
			}
			public void set_client_crt_path(java.lang.String v){
				super.set(super.type.generated_offsets[8],v);
			}
			public static SmtpConfig create(ai.greycat.GreyCat greycat, java.lang.String host, java.lang.Long port, ai.greycat.network.smtp.SmtpMode mode, ai.greycat.network.smtp.SmtpAuthMode authenticate, java.lang.String user, java.lang.String pass, java.lang.Long debug_level, java.lang.String client_key_path, java.lang.String client_crt_path){
				return new SmtpConfig(greycat.libs_by_name.get(ai.greycat.network.name).mapped[1], host, port, mode, authenticate, user, pass, debug_level, client_key_path, client_crt_path);
			}
		}
		public static final class EmailContentType extends GreyCat.Enum {
			public static final java.lang.String name = "smtp::EmailContentType";
			private EmailContentType(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.network.smtp.EmailContentType text(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.network.name).mapped[2];
				return (ai.greycat.network.smtp.EmailContentType) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.network.smtp.EmailContentType html(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.network.name).mapped[2];
				return (ai.greycat.network.smtp.EmailContentType) t.enum_values[t.generated_offsets[1]];
			}
			public static EmailContentType create(ai.greycat.GreyCat greycat){
				return new EmailContentType(greycat.libs_by_name.get(ai.greycat.network.name).mapped[2]);
			}
		}
		public static final class Email extends GreyCat.Object {
			public static final java.lang.String name = "smtp::Email";
			private Email(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String from(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_from(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> to(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[1]);
			}
			public void set_to(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> cc(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[2]);
			}
			public void set_cc(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> bcc(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[3]);
			}
			public void set_bcc(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.String subject(){
				return (java.lang.String)super.get(super.type.generated_offsets[4]);
			}
			public void set_subject(java.lang.String v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.network.smtp.EmailContentType contentType(){
				return (ai.greycat.network.smtp.EmailContentType)super.get(super.type.generated_offsets[5]);
			}
			public void set_contentType(ai.greycat.network.smtp.EmailContentType v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.String body(){
				return (java.lang.String)super.get(super.type.generated_offsets[6]);
			}
			public void set_body(java.lang.String v){
				super.set(super.type.generated_offsets[6],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> attachments(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[7]);
			}
			public void set_attachments(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[7],v);
			}
			public static Email create(ai.greycat.GreyCat greycat, java.lang.String from, ai.greycat.std.core.Array<java.lang.String> to, ai.greycat.std.core.Array<java.lang.String> cc, ai.greycat.std.core.Array<java.lang.String> bcc, java.lang.String subject, ai.greycat.network.smtp.EmailContentType contentType, java.lang.String body, ai.greycat.std.core.Array<java.lang.String> attachments){
				return new Email(greycat.libs_by_name.get(ai.greycat.network.name).mapped[3], from, to, cc, bcc, subject, contentType, body, attachments);
			}
		}
		public static final class SmtpAuthMode extends GreyCat.Enum {
			public static final java.lang.String name = "smtp::SmtpAuthMode";
			private SmtpAuthMode(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.network.smtp.SmtpAuthMode none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.network.name).mapped[4];
				return (ai.greycat.network.smtp.SmtpAuthMode) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.network.smtp.SmtpAuthMode plain(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.network.name).mapped[4];
				return (ai.greycat.network.smtp.SmtpAuthMode) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.network.smtp.SmtpAuthMode login(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.network.name).mapped[4];
				return (ai.greycat.network.smtp.SmtpAuthMode) t.enum_values[t.generated_offsets[2]];
			}
			public static SmtpAuthMode create(ai.greycat.GreyCat greycat){
				return new SmtpAuthMode(greycat.libs_by_name.get(ai.greycat.network.name).mapped[4]);
			}
		}
		public static final class SmtpMode extends GreyCat.Enum {
			public static final java.lang.String name = "smtp::SmtpMode";
			private SmtpMode(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.network.smtp.SmtpMode plain(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.network.name).mapped[5];
				return (ai.greycat.network.smtp.SmtpMode) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.network.smtp.SmtpMode ssl_tls(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.network.name).mapped[5];
				return (ai.greycat.network.smtp.SmtpMode) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.network.smtp.SmtpMode starttls(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.network.name).mapped[5];
				return (ai.greycat.network.smtp.SmtpMode) t.enum_values[t.generated_offsets[2]];
			}
			public static SmtpMode create(ai.greycat.GreyCat greycat){
				return new SmtpMode(greycat.libs_by_name.get(ai.greycat.network.name).mapped[5]);
			}
		}
		public static final class Smtp extends GreyCat.Object {
			public static final java.lang.String name = "smtp::Smtp";
			private Smtp(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static Smtp create(ai.greycat.GreyCat greycat){
				return new Smtp(greycat.libs_by_name.get(ai.greycat.network.name).mapped[6]);
			}
		}
	}
	public static final class http {
		public static final class Http extends GreyCat.Object {
			public static final java.lang.String name = "http::Http";
			private Http(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static Http create(ai.greycat.GreyCat greycat){
				return new Http(greycat.libs_by_name.get(ai.greycat.network.name).mapped[7]);
			}
		}
	}
	@Override
	public void configure(java.util.Map<String, ai.greycat.GreyCat.Loader> loaders, java.util.Map<String, ai.greycat.GreyCat.Factory> factories) {
		factories.put(keycloak.KeycloakRealm.name, keycloak.KeycloakRealm::new);
		factories.put(smtp.SmtpConfig.name, smtp.SmtpConfig::new);
		factories.put(smtp.EmailContentType.name, smtp.EmailContentType::new);
		factories.put(smtp.Email.name, smtp.Email::new);
		factories.put(smtp.SmtpAuthMode.name, smtp.SmtpAuthMode::new);
		factories.put(smtp.SmtpMode.name, smtp.SmtpMode::new);
		factories.put(smtp.Smtp.name, smtp.Smtp::new);
		factories.put(http.Http.name, http.Http::new);
	}
	@Override
	public void init(ai.greycat.GreyCat greycat) {
		this.mapped = new ai.greycat.GreyCat.Type[8];
		this.mapped[0] = greycat.types_by_name.get(keycloak.KeycloakRealm.name);
		this.mapped[0].resolveGeneratedOffsets("host","realm","client_id","client_secret","public_key");
		this.mapped[1] = greycat.types_by_name.get(smtp.SmtpConfig.name);
		this.mapped[1].resolveGeneratedOffsets("host","port","mode","authenticate","user","pass","debug_level","client_key_path","client_crt_path");
		this.mapped[2] = greycat.types_by_name.get(smtp.EmailContentType.name);
		this.mapped[2].resolveGeneratedOffsetWithValues("text", "text/plain","html", "text/html");
		this.mapped[3] = greycat.types_by_name.get(smtp.Email.name);
		this.mapped[3].resolveGeneratedOffsets("from","to","cc","bcc","subject","contentType","body","attachments");
		this.mapped[4] = greycat.types_by_name.get(smtp.SmtpAuthMode.name);
		this.mapped[4].resolveGeneratedOffsetWithValues("none", 0L,"plain", 1L,"login", 2L);
		this.mapped[5] = greycat.types_by_name.get(smtp.SmtpMode.name);
		this.mapped[5].resolveGeneratedOffsetWithValues("plain", 0L,"ssl_tls", 1L,"starttls", 2L);
		this.mapped[6] = greycat.types_by_name.get(smtp.Smtp.name);
		this.mapped[7] = greycat.types_by_name.get(http.Http.name);
	}
}
