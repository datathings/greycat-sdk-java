// AUTO-GENERATED FILE PLEASE DO NOT MODIFY MANUALLY
package ai.greycat;
@SuppressWarnings({"unused", "unchecked"})
public final class algebra extends ai.greycat.GreyCat.Library {
	public static final java.lang.String name = "algebra";
	@Override
	public String name() {
		return name;
	}
	public static final class compute {
		public static final class ComputeClassificationLoss extends GreyCat.Enum {
			public static final java.lang.String name = "compute::ComputeClassificationLoss";
			private ComputeClassificationLoss(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.compute.ComputeClassificationLoss categorical_cross_entropy(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[0];
				return (ai.greycat.algebra.compute.ComputeClassificationLoss) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.compute.ComputeClassificationLoss sparse_categorical_cross_entropy(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[0];
				return (ai.greycat.algebra.compute.ComputeClassificationLoss) t.enum_values[t.generated_offsets[1]];
			}
			public static ComputeClassificationLoss create(ai.greycat.GreyCat greycat){
				return new ComputeClassificationLoss(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[0]);
			}
		}
		public static final class ComputeLayerActivation extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerActivation";
			private ComputeLayerActivation(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.compute.ComputeActivation activation(){
				return (ai.greycat.algebra.compute.ComputeActivation)super.get(super.type.generated_offsets[1]);
			}
			public void set_activation(ai.greycat.algebra.compute.ComputeActivation v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static java.lang.String var_input_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[1];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_output_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[1];
				return (java.lang.String) t.static_values[1];
			}
			public static ComputeLayerActivation create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.algebra.compute.ComputeActivation activation){
				return new ComputeLayerActivation(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[1], name, activation);
			}
		}
		public static final class ComputeOperationClip extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationClip";
			private ComputeOperationClip(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double min(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_min(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double max(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_max(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static ComputeOperationClip create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Double min, java.lang.Double max){
				return new ComputeOperationClip(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[2], input, output, min, max);
			}
		}
		public static final class ComputeInitializerXavier extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerXavier";
			private ComputeInitializerXavier(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerXavier create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerXavier(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[3]);
			}
		}
		public static final class ComputeOperationAtanh extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAtanh";
			private ComputeOperationAtanh(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationAtanh create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationAtanh(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[4], input, output);
			}
		}
		public static final class ComputeInitializerRelu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerRelu";
			private ComputeInitializerRelu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerRelu create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerRelu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[5]);
			}
		}
		public static final class ComputeOperationSoftSign extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSoftSign";
			private ComputeOperationSoftSign(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationSoftSign create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationSoftSign(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[6], input, output);
			}
		}
		public static final class ComputeOperationSinh extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSinh";
			private ComputeOperationSinh(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationSinh create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationSinh(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[7], input, output);
			}
		}
		public static final class ComputeState extends ai.greycat.algebra_n.compute.ComputeState {
			public static final java.lang.String name = "compute::ComputeState";
			private ComputeState(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static ComputeState create(ai.greycat.GreyCat greycat){
				return new ComputeState(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[8]);
			}
		}
		public static final class ComputeActivationSelu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationSelu";
			private ComputeActivationSelu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeActivationSelu create(ai.greycat.GreyCat greycat){
				return new ComputeActivationSelu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[9]);
			}
		}
		public static final class ComputeLayerClassification extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerClassification";
			private ComputeLayerClassification(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean calculate_probabilities(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_calculate_probabilities(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean from_logits(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[2]);
			}
			public void set_from_logits(java.lang.Boolean v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.String var_input_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[10];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_predicted_classes_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[10];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_probabilities_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[10];
				return (java.lang.String) t.static_values[2];
			}
			public static ComputeLayerClassification create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Boolean calculate_probabilities, java.lang.Boolean from_logits){
				return new ComputeLayerClassification(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[10], name, calculate_probabilities, from_logits);
			}
		}
		public static final class ComputeInitializerNormalOut extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerNormalOut";
			private ComputeInitializerNormalOut(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerNormalOut create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerNormalOut(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[11]);
			}
		}
		public static final class ComputeActivationLeakyRelu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationLeakyRelu";
			private ComputeActivationLeakyRelu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double alpha(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_alpha(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double max_value(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_max_value(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double threshold(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_threshold(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.Double alpha_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[12];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double threshold_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[12];
				return (java.lang.Double) t.static_values[1];
			}
			public static ComputeActivationLeakyRelu create(ai.greycat.GreyCat greycat, java.lang.Double alpha, java.lang.Double max_value, java.lang.Double threshold){
				return new ComputeActivationLeakyRelu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[12], alpha, max_value, threshold);
			}
		}
		public static final class ComputeOperationFill extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationFill";
			private ComputeOperationFill(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Object value(){
				return super.get(super.type.generated_offsets[1]);
			}
			public void set_value(java.lang.Object v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationFill create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.Object value){
				return new ComputeOperationFill(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[13], input, value);
			}
		}
		public static final class ComputeOptimizerNadam extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerNadam";
			private ComputeOptimizerNadam(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double beta1(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_beta1(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double beta2(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_beta2(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double smooth_epsilon(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_smooth_epsilon(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[14];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double beta1_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[14];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double beta2_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[14];
				return (java.lang.Double) t.static_values[2];
			}
			public static java.lang.Double smooth_epsilon_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[14];
				return (java.lang.Double) t.static_values[3];
			}
			public static ComputeOptimizerNadam create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate, java.lang.Double beta1, java.lang.Double beta2, java.lang.Double smooth_epsilon){
				return new ComputeOptimizerNadam(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[14], learning_rate, beta1, beta2, smooth_epsilon);
			}
		}
		public static final class ComputeActivationHardSigmoid extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationHardSigmoid";
			private ComputeActivationHardSigmoid(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double slope(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_slope(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double shift(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_shift(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static java.lang.Double slope_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[15];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double shift_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[15];
				return (java.lang.Double) t.static_values[1];
			}
			public static ComputeActivationHardSigmoid create(ai.greycat.GreyCat greycat, java.lang.Double slope, java.lang.Double shift){
				return new ComputeActivationHardSigmoid(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[15], slope, shift);
			}
		}
		public static final class ComputeLayerStandardScaler extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerStandardScaler";
			private ComputeLayerStandardScaler(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean inverse_transform(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[2]);
			}
			public void set_inverse_transform(java.lang.Boolean v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.String var_input_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[16];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_output_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[16];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_avg_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[16];
				return (java.lang.String) t.static_values[2];
			}
			public static java.lang.String var_std_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[16];
				return (java.lang.String) t.static_values[3];
			}
			public static ComputeLayerStandardScaler create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.TensorType type, java.lang.Boolean inverse_transform){
				return new ComputeLayerStandardScaler(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[16], name, type, inverse_transform);
			}
		}
		public static final class ComputeOperationMatMul extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationMatMul";
			private ComputeOperationMatMul(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Boolean transposeA(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[3]);
			}
			public void set_transposeA(java.lang.Boolean v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Boolean transposeB(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[4]);
			}
			public void set_transposeB(java.lang.Boolean v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Double alpha(){
				return (java.lang.Double)super.get(super.type.generated_offsets[5]);
			}
			public void set_alpha(java.lang.Double v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Double beta(){
				return (java.lang.Double)super.get(super.type.generated_offsets[6]);
			}
			public void set_beta(java.lang.Double v){
				super.set(super.type.generated_offsets[6],v);
			}
			public static java.lang.Boolean transpose_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[17];
				return (java.lang.Boolean) t.static_values[0];
			}
			public static java.lang.Double alpha_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[17];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double beta_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[17];
				return (java.lang.Double) t.static_values[2];
			}
			public static ComputeOperationMatMul create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output, java.lang.Boolean transposeA, java.lang.Boolean transposeB, java.lang.Double alpha, java.lang.Double beta){
				return new ComputeOperationMatMul(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[17], input, input2, output, transposeA, transposeB, alpha, beta);
			}
		}
		public static final class ComputeLayerSeq extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerSeq";
			private ComputeLayerSeq(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayerCall> calls(){
				return (ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayerCall>)super.get(super.type.generated_offsets[1]);
			}
			public void set_calls(ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayerCall> v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.compute.ComputeOptimizer optimizer(){
				return (ai.greycat.algebra.compute.ComputeOptimizer)super.get(super.type.generated_offsets[2]);
			}
			public void set_optimizer(ai.greycat.algebra.compute.ComputeOptimizer v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeLayerSeq create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayerCall> calls, ai.greycat.algebra.compute.ComputeOptimizer optimizer){
				return new ComputeLayerSeq(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[18], name, calls, optimizer);
			}
		}
		public static final class ComputeOperationSoftplus extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSoftplus";
			private ComputeOperationSoftplus(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationSoftplus create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationSoftplus(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[19], input, output);
			}
		}
		public static final class ComputeOperationElu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationElu";
			private ComputeOperationElu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double alpha(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_alpha(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.Double alpha_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[20];
				return (java.lang.Double) t.static_values[0];
			}
			public static ComputeOperationElu create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Double alpha){
				return new ComputeOperationElu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[20], input, output, alpha);
			}
		}
		public static final class ComputeOperationLog extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationLog";
			private ComputeOperationLog(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationLog create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationLog(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[21], input, output);
			}
		}
		public static final class ComputeOperationSigmoid extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSigmoid";
			private ComputeOperationSigmoid(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationSigmoid create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationSigmoid(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[22], input, output);
			}
		}
		public static final class ComputeLayerPCAScaler extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerPCAScaler";
			private ComputeLayerPCAScaler(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean inverse_transform(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[2]);
			}
			public void set_inverse_transform(java.lang.Boolean v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.String var_input_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[23];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_output_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[23];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_avg_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[23];
				return (java.lang.String) t.static_values[2];
			}
			public static java.lang.String var_std_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[23];
				return (java.lang.String) t.static_values[3];
			}
			public static java.lang.String var_space_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[23];
				return (java.lang.String) t.static_values[4];
			}
			public static ComputeLayerPCAScaler create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.TensorType type, java.lang.Boolean inverse_transform){
				return new ComputeLayerPCAScaler(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[23], name, type, inverse_transform);
			}
		}
		public static final class ComputeVarInOut extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeVarInOut";
			private ComputeVarInOut(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Array<java.lang.Long> shape(){
				return (ai.greycat.std.core.Array<java.lang.Long>)super.get(super.type.generated_offsets[2]);
			}
			public void set_shape(ai.greycat.std.core.Array<java.lang.Long> v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Boolean with_grad(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[3]);
			}
			public void set_with_grad(java.lang.Boolean v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static ComputeVarInOut create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.TensorType type, ai.greycat.std.core.Array<java.lang.Long> shape, java.lang.Boolean with_grad){
				return new ComputeVarInOut(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[24], name, type, shape, with_grad);
			}
		}
		public static final class ComputeOptimizer extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizer";
			private ComputeOptimizer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static ComputeOptimizer create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate){
				return new ComputeOptimizer(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[25], learning_rate);
			}
		}
		public static final class ComputeActivationSoftplus extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationSoftplus";
			private ComputeActivationSoftplus(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeActivationSoftplus create(ai.greycat.GreyCat greycat){
				return new ComputeActivationSoftplus(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[26]);
			}
		}
		public static final class ComputeOperationCos extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationCos";
			private ComputeOperationCos(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationCos create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationCos(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[27], input, output);
			}
		}
		public static final class ComputeInitializerXavierUniform extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerXavierUniform";
			private ComputeInitializerXavierUniform(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerXavierUniform create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerXavierUniform(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[28]);
			}
		}
		public static final class ComputeInitializerUniformOut extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerUniformOut";
			private ComputeInitializerUniformOut(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerUniformOut create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerUniformOut(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[29]);
			}
		}
		public static final class ComputeOperationArg extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationArg";
			private ComputeOperationArg(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output2(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output2(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationArg create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.String output2){
				return new ComputeOperationArg(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[30], input, output, output2);
			}
		}
		public static final class ComputeActivationSoftSign extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationSoftSign";
			private ComputeActivationSoftSign(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeActivationSoftSign create(ai.greycat.GreyCat greycat){
				return new ComputeActivationSoftSign(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[31]);
			}
		}
		public static final class ComputeOptimizerAdaMax extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerAdaMax";
			private ComputeOptimizerAdaMax(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double beta1(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_beta1(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double beta2(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_beta2(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double smooth_epsilon(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_smooth_epsilon(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[32];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double beta1_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[32];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double beta2_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[32];
				return (java.lang.Double) t.static_values[2];
			}
			public static java.lang.Double smooth_epsilon_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[32];
				return (java.lang.Double) t.static_values[3];
			}
			public static ComputeOptimizerAdaMax create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate, java.lang.Double beta1, java.lang.Double beta2, java.lang.Double smooth_epsilon){
				return new ComputeOptimizerAdaMax(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[32], learning_rate, beta1, beta2, smooth_epsilon);
			}
		}
		public static final class ComputeInitializerLeCunUniform extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerLeCunUniform";
			private ComputeInitializerLeCunUniform(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerLeCunUniform create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerLeCunUniform(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[33]);
			}
		}
		public static final class ComputeVarOptimize extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeVarOptimize";
			private ComputeVarOptimize(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Array<java.lang.Long> shape(){
				return (ai.greycat.std.core.Array<java.lang.Long>)super.get(super.type.generated_offsets[2]);
			}
			public void set_shape(ai.greycat.std.core.Array<java.lang.Long> v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double l1(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_l1(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Double l2(){
				return (java.lang.Double)super.get(super.type.generated_offsets[4]);
			}
			public void set_l2(java.lang.Double v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.algebra.compute.ComputeInitializer init(){
				return (ai.greycat.algebra.compute.ComputeInitializer)super.get(super.type.generated_offsets[5]);
			}
			public void set_init(ai.greycat.algebra.compute.ComputeInitializer v){
				super.set(super.type.generated_offsets[5],v);
			}
			public static ComputeVarOptimize create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.TensorType type, ai.greycat.std.core.Array<java.lang.Long> shape, java.lang.Double l1, java.lang.Double l2, ai.greycat.algebra.compute.ComputeInitializer init){
				return new ComputeVarOptimize(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[34], name, type, shape, l1, l2, init);
			}
		}
		public static final class ComputeInitializerUniformIn extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerUniformIn";
			private ComputeInitializerUniformIn(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerUniformIn create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerUniformIn(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[35]);
			}
		}
		public static final class ComputeOperationAsin extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAsin";
			private ComputeOperationAsin(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationAsin create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationAsin(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[36], input, output);
			}
		}
		public static final class ComputeOperationExp extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationExp";
			private ComputeOperationExp(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationExp create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationExp(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[37], input, output);
			}
		}
		public static final class ComputeVarConst extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeVarConst";
			private ComputeVarConst(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Array<java.lang.Long> shape(){
				return (ai.greycat.std.core.Array<java.lang.Long>)super.get(super.type.generated_offsets[2]);
			}
			public void set_shape(ai.greycat.std.core.Array<java.lang.Long> v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeVarConst create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.TensorType type, ai.greycat.std.core.Array<java.lang.Long> shape){
				return new ComputeVarConst(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[38], name, type, shape);
			}
		}
		public static final class ComputeOperationMul extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationMul";
			private ComputeOperationMul(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationMul create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output){
				return new ComputeOperationMul(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[39], input, input2, output);
			}
		}
		public static final class ComputeInitializerNormalIn extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerNormalIn";
			private ComputeInitializerNormalIn(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerNormalIn create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerNormalIn(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[40]);
			}
		}
		public static final class ComputeInitializerLSTM extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerLSTM";
			private ComputeInitializerLSTM(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerLSTM create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerLSTM(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[41]);
			}
		}
		public static final class ComputeOperationLeCunTanh extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationLeCunTanh";
			private ComputeOperationLeCunTanh(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationLeCunTanh create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationLeCunTanh(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[42], input, output);
			}
		}
		public static final class ComputeOperationPow extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationPow";
			private ComputeOperationPow(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationPow create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output){
				return new ComputeOperationPow(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[43], input, input2, output);
			}
		}
		public static final class ComputeLayerLoss extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerLoss";
			private ComputeLayerLoss(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.compute.ComputeReduction reduction(){
				return (ai.greycat.algebra.compute.ComputeReduction)super.get(super.type.generated_offsets[1]);
			}
			public void set_reduction(ai.greycat.algebra.compute.ComputeReduction v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static java.lang.String var_computed_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[44];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_expected_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[44];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_loss_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[44];
				return (java.lang.String) t.static_values[2];
			}
			public static ComputeLayerLoss create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.algebra.compute.ComputeReduction reduction){
				return new ComputeLayerLoss(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[44], name, reduction);
			}
		}
		public static final class ComputeOperation2In1Out extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperation2In1Out";
			private ComputeOperation2In1Out(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperation2In1Out create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output){
				return new ComputeOperation2In1Out(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[45], input, input2, output);
			}
		}
		public static final class ComputeOptimizerNesterov extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerNesterov";
			private ComputeOptimizerNesterov(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double decay_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_decay_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[46];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double decay_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[46];
				return (java.lang.Double) t.static_values[1];
			}
			public static ComputeOptimizerNesterov create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate, java.lang.Double decay_rate){
				return new ComputeOptimizerNesterov(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[46], learning_rate, decay_rate);
			}
		}
		public static final class ComputeInitializerIdentity extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerIdentity";
			private ComputeInitializerIdentity(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerIdentity create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerIdentity(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[47]);
			}
		}
		public static final class ComputeActivation extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivation";
			private ComputeActivation(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeActivation create(ai.greycat.GreyCat greycat){
				return new ComputeActivation(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[48]);
			}
		}
		public static final class ComputeOperationSin extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSin";
			private ComputeOperationSin(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationSin create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationSin(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[49], input, output);
			}
		}
		public static final class ComputeOperationAbs extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAbs";
			private ComputeOperationAbs(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationAbs create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationAbs(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[50], input, output);
			}
		}
		public static final class ComputeInitializerConstant extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerConstant";
			private ComputeInitializerConstant(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Object value(){
				return super.get(super.type.generated_offsets[0]);
			}
			public void set_value(java.lang.Object v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static ComputeInitializerConstant create(ai.greycat.GreyCat greycat, java.lang.Object value){
				return new ComputeInitializerConstant(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[51], value);
			}
		}
		public static final class ComputeOperationAvg extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAvg";
			private ComputeOperationAvg(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationAvg create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output){
				return new ComputeOperationAvg(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[52], input, input2, output);
			}
		}
		public static final class ComputeOperationSumIf extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSumIf";
			private ComputeOperationSumIf(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String ifCondition(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_ifCondition(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.String counts(){
				return (java.lang.String)super.get(super.type.generated_offsets[3]);
			}
			public void set_counts(java.lang.String v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long classes(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_classes(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static ComputeOperationSumIf create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String ifCondition, java.lang.String output, java.lang.String counts, java.lang.Long classes){
				return new ComputeOperationSumIf(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[53], input, ifCondition, output, counts, classes);
			}
		}
		public static final class ComputeOptimizerAdaGrad extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerAdaGrad";
			private ComputeOptimizerAdaGrad(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double initial_accumulator(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_initial_accumulator(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double smooth_epsilon(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_smooth_epsilon(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[54];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double initial_accumulator_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[54];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double smooth_epsilon_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[54];
				return (java.lang.Double) t.static_values[2];
			}
			public static ComputeOptimizerAdaGrad create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate, java.lang.Double initial_accumulator, java.lang.Double smooth_epsilon){
				return new ComputeOptimizerAdaGrad(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[54], learning_rate, initial_accumulator, smooth_epsilon);
			}
		}
		public static final class ComputeLayerMinMaxScaler extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerMinMaxScaler";
			private ComputeLayerMinMaxScaler(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Boolean inverse_transform(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[2]);
			}
			public void set_inverse_transform(java.lang.Boolean v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.String var_input_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[55];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_output_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[55];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_min_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[55];
				return (java.lang.String) t.static_values[2];
			}
			public static java.lang.String var_max_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[55];
				return (java.lang.String) t.static_values[3];
			}
			public static ComputeLayerMinMaxScaler create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.TensorType type, java.lang.Boolean inverse_transform){
				return new ComputeLayerMinMaxScaler(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[55], name, type, inverse_transform);
			}
		}
		public static final class ComputeCounter extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeCounter";
			private ComputeCounter(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long epoch(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_epoch(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long optimizationSteps(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_optimizationSteps(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long batchNotOptimized(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_batchNotOptimized(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeCounter create(ai.greycat.GreyCat greycat, java.lang.Long epoch, java.lang.Long optimizationSteps, java.lang.Long batchNotOptimized){
				return new ComputeCounter(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[56], epoch, optimizationSteps, batchNotOptimized);
			}
		}
		public static final class ComputeVar extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeVar";
			private ComputeVar(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static ComputeVar create(ai.greycat.GreyCat greycat, java.lang.String name){
				return new ComputeVar(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[57], name);
			}
		}
		public static final class ComputeReduction extends GreyCat.Enum {
			public static final java.lang.String name = "compute::ComputeReduction";
			private ComputeReduction(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.compute.ComputeReduction auto(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[58];
				return (ai.greycat.algebra.compute.ComputeReduction) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.compute.ComputeReduction none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[58];
				return (ai.greycat.algebra.compute.ComputeReduction) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.compute.ComputeReduction sum(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[58];
				return (ai.greycat.algebra.compute.ComputeReduction) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.compute.ComputeReduction mean(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[58];
				return (ai.greycat.algebra.compute.ComputeReduction) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.algebra.compute.ComputeReduction disabled(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[58];
				return (ai.greycat.algebra.compute.ComputeReduction) t.enum_values[t.generated_offsets[4]];
			}
			public static ComputeReduction create(ai.greycat.GreyCat greycat){
				return new ComputeReduction(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[58]);
			}
		}
		public static final class ComputeInitializerNormal extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerNormal";
			private ComputeInitializerNormal(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double avg(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_avg(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double std(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_std(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeInitializerNormal create(ai.greycat.GreyCat greycat, java.lang.Double avg, java.lang.Double std){
				return new ComputeInitializerNormal(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[59], avg, std);
			}
		}
		public static final class ComputeOperationNeg extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationNeg";
			private ComputeOperationNeg(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationNeg create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationNeg(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[60], input, output);
			}
		}
		public static final class ComputeOperationTan extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationTan";
			private ComputeOperationTan(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationTan create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationTan(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[61], input, output);
			}
		}
		public static final class ComputeOperationRaiseToPower extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationRaiseToPower";
			private ComputeOperationRaiseToPower(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double power(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_power(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationRaiseToPower create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Double power){
				return new ComputeOperationRaiseToPower(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[62], input, output, power);
			}
		}
		public static final class ComputeOperationDiv extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationDiv";
			private ComputeOperationDiv(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationDiv create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output){
				return new ComputeOperationDiv(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[63], input, input2, output);
			}
		}
		public static final class ComputeLayerLossClassification extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerLossClassification";
			private ComputeLayerLossClassification(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.compute.ComputeReduction reduction(){
				return (ai.greycat.algebra.compute.ComputeReduction)super.get(super.type.generated_offsets[1]);
			}
			public void set_reduction(ai.greycat.algebra.compute.ComputeReduction v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.compute.ComputeClassificationLoss loss_type(){
				return (ai.greycat.algebra.compute.ComputeClassificationLoss)super.get(super.type.generated_offsets[2]);
			}
			public void set_loss_type(ai.greycat.algebra.compute.ComputeClassificationLoss v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Boolean has_class_weights(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[3]);
			}
			public void set_has_class_weights(java.lang.Boolean v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Boolean calculate_probabilities(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[4]);
			}
			public void set_calculate_probabilities(java.lang.Boolean v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Boolean from_logits(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[5]);
			}
			public void set_from_logits(java.lang.Boolean v){
				super.set(super.type.generated_offsets[5],v);
			}
			public static java.lang.String var_class_weights_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[64];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_predicted_classes_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[64];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_probabilities_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[64];
				return (java.lang.String) t.static_values[2];
			}
			public static java.lang.String var_sum_reduce_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[64];
				return (java.lang.String) t.static_values[3];
			}
			public static ComputeLayerLossClassification create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.algebra.compute.ComputeReduction reduction, ai.greycat.algebra.compute.ComputeClassificationLoss loss_type, java.lang.Boolean has_class_weights, java.lang.Boolean calculate_probabilities, java.lang.Boolean from_logits){
				return new ComputeLayerLossClassification(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[64], name, reduction, loss_type, has_class_weights, calculate_probabilities, from_logits);
			}
		}
		public static final class ComputeOperationAcos extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAcos";
			private ComputeOperationAcos(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationAcos create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationAcos(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[65], input, output);
			}
		}
		public static final class ComputeVariable extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeVariable";
			private ComputeVariable(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static ComputeVariable create(ai.greycat.GreyCat greycat, java.lang.String name){
				return new ComputeVariable(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[66], name);
			}
		}
		public static final class ComputeLayerConfusion extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerConfusion";
			private ComputeLayerConfusion(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long nbClass(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_nbClass(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static java.lang.String var_computed_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[67];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_expected_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[67];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_confusion_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[67];
				return (java.lang.String) t.static_values[2];
			}
			public static ComputeLayerConfusion create(ai.greycat.GreyCat greycat, java.lang.String name, java.lang.Long nbClass){
				return new ComputeLayerConfusion(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[67], name, nbClass);
			}
		}
		public static final class ComputeOperation1In1Out extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperation1In1Out";
			private ComputeOperation1In1Out(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperation1In1Out create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperation1In1Out(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[68], input, output);
			}
		}
		public static final class ComputeModel extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeModel";
			private ComputeModel(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers(){
				return (ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer>)super.get(super.type.generated_offsets[0]);
			}
			public void set_layers(ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static ComputeModel create(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers){
				return new ComputeModel(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[69], layers);
			}
		}
		public static final class ComputeOperationAsinh extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAsinh";
			private ComputeOperationAsinh(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationAsinh create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationAsinh(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[70], input, output);
			}
		}
		public static final class ComputeOperationHardSigmoid extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationHardSigmoid";
			private ComputeOperationHardSigmoid(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double slope(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_slope(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double shift(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_shift(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static java.lang.Double slope_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[71];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double shift_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[71];
				return (java.lang.Double) t.static_values[1];
			}
			public static ComputeOperationHardSigmoid create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Double slope, java.lang.Double shift){
				return new ComputeOperationHardSigmoid(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[71], input, output, slope, shift);
			}
		}
		public static final class ComputeActivationTanh extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationTanh";
			private ComputeActivationTanh(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeActivationTanh create(ai.greycat.GreyCat greycat){
				return new ComputeActivationTanh(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[72]);
			}
		}
		public static final class ComputeRegularizer extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeRegularizer";
			private ComputeRegularizer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double l1(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_l1(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double l2(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_l2(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeRegularizer create(ai.greycat.GreyCat greycat, java.lang.Double l1, java.lang.Double l2){
				return new ComputeRegularizer(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[73], l1, l2);
			}
		}
		public static final class ComputeOperationTanh extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationTanh";
			private ComputeOperationTanh(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationTanh create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationTanh(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[74], input, output);
			}
		}
		public static final class ComputeLayer extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayer";
			private ComputeLayer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static ComputeLayer create(ai.greycat.GreyCat greycat, java.lang.String name){
				return new ComputeLayer(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[75], name);
			}
		}
		public static final class ComputeOptimizerAdaDelta extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerAdaDelta";
			private ComputeOptimizerAdaDelta(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double decay_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_decay_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double smooth_epsilon(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_smooth_epsilon(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[76];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double decay_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[76];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double smooth_epsilon_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[76];
				return (java.lang.Double) t.static_values[2];
			}
			public static ComputeOptimizerAdaDelta create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate, java.lang.Double decay_rate, java.lang.Double smooth_epsilon){
				return new ComputeOptimizerAdaDelta(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[76], learning_rate, decay_rate, smooth_epsilon);
			}
		}
		public static final class ComputeOperationArgMax extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationArgMax";
			private ComputeOperationArgMax(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output2(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output2(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationArgMax create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.String output2){
				return new ComputeOperationArgMax(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[77], input, output, output2);
			}
		}
		public static final class ComputeOperationSoftmax extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSoftmax";
			private ComputeOperationSoftmax(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationSoftmax create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationSoftmax(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[78], input, output);
			}
		}
		public static final class ComputeLayerDense extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerDense";
			private ComputeLayerDense(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long inputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_inputs(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long outputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_outputs(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Boolean use_bias(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[4]);
			}
			public void set_use_bias(java.lang.Boolean v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.algebra.compute.ComputeInitializer weight_initializer(){
				return (ai.greycat.algebra.compute.ComputeInitializer)super.get(super.type.generated_offsets[5]);
			}
			public void set_weight_initializer(ai.greycat.algebra.compute.ComputeInitializer v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.algebra.compute.ComputeRegularizer weight_regularizer(){
				return (ai.greycat.algebra.compute.ComputeRegularizer)super.get(super.type.generated_offsets[6]);
			}
			public void set_weight_regularizer(ai.greycat.algebra.compute.ComputeRegularizer v){
				super.set(super.type.generated_offsets[6],v);
			}
			public ai.greycat.algebra.compute.ComputeInitializer bias_initializer(){
				return (ai.greycat.algebra.compute.ComputeInitializer)super.get(super.type.generated_offsets[7]);
			}
			public void set_bias_initializer(ai.greycat.algebra.compute.ComputeInitializer v){
				super.set(super.type.generated_offsets[7],v);
			}
			public ai.greycat.algebra.compute.ComputeRegularizer bias_regularizer(){
				return (ai.greycat.algebra.compute.ComputeRegularizer)super.get(super.type.generated_offsets[8]);
			}
			public void set_bias_regularizer(ai.greycat.algebra.compute.ComputeRegularizer v){
				super.set(super.type.generated_offsets[8],v);
			}
			public ai.greycat.algebra.compute.ComputeActivation activation(){
				return (ai.greycat.algebra.compute.ComputeActivation)super.get(super.type.generated_offsets[9]);
			}
			public void set_activation(ai.greycat.algebra.compute.ComputeActivation v){
				super.set(super.type.generated_offsets[9],v);
			}
			public static java.lang.String var_input_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[79];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_output_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[79];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_weight_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[79];
				return (java.lang.String) t.static_values[2];
			}
			public static java.lang.String var_bias_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[79];
				return (java.lang.String) t.static_values[3];
			}
			public static java.lang.String var_mult_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[79];
				return (java.lang.String) t.static_values[4];
			}
			public static java.lang.String var_pre_activation_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[79];
				return (java.lang.String) t.static_values[5];
			}
			public static ComputeLayerDense create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.TensorType type, java.lang.Long inputs, java.lang.Long outputs, java.lang.Boolean use_bias, ai.greycat.algebra.compute.ComputeInitializer weight_initializer, ai.greycat.algebra.compute.ComputeRegularizer weight_regularizer, ai.greycat.algebra.compute.ComputeInitializer bias_initializer, ai.greycat.algebra.compute.ComputeRegularizer bias_regularizer, ai.greycat.algebra.compute.ComputeActivation activation){
				return new ComputeLayerDense(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[79], name, type, inputs, outputs, use_bias, weight_initializer, weight_regularizer, bias_initializer, bias_regularizer, activation);
			}
		}
		public static final class ComputeLayerCustom extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerCustom";
			private ComputeLayerCustom(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeOperation> ops(){
				return (ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeOperation>)super.get(super.type.generated_offsets[1]);
			}
			public void set_ops(ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeOperation> v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeVariable> vars(){
				return (ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeVariable>)super.get(super.type.generated_offsets[2]);
			}
			public void set_vars(ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeVariable> v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeLayerCustom create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeOperation> ops, ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeVariable> vars){
				return new ComputeLayerCustom(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[80], name, ops, vars);
			}
		}
		public static final class ComputeVarProxy extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeVarProxy";
			private ComputeVarProxy(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static ComputeVarProxy create(ai.greycat.GreyCat greycat, java.lang.String name){
				return new ComputeVarProxy(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[81], name);
			}
		}
		public static final class ComputeOperationEuclidean extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationEuclidean";
			private ComputeOperationEuclidean(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationEuclidean create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output){
				return new ComputeOperationEuclidean(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[82], input, input2, output);
			}
		}
		public static final class ComputeInitializerGlorotUniform extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerGlorotUniform";
			private ComputeInitializerGlorotUniform(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerGlorotUniform create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerGlorotUniform(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[83]);
			}
		}
		public static final class ComputeOperation extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperation";
			private ComputeOperation(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeOperation create(ai.greycat.GreyCat greycat){
				return new ComputeOperation(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[84]);
			}
		}
		public static final class ComputeActivationCelu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationCelu";
			private ComputeActivationCelu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double alpha(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_alpha(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static java.lang.Double alpha_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[85];
				return (java.lang.Double) t.static_values[0];
			}
			public static ComputeActivationCelu create(ai.greycat.GreyCat greycat, java.lang.Double alpha){
				return new ComputeActivationCelu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[85], alpha);
			}
		}
		public static final class ComputeOperationCelu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationCelu";
			private ComputeOperationCelu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double alpha(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_alpha(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.Double alpha_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[86];
				return (java.lang.Double) t.static_values[0];
			}
			public static ComputeOperationCelu create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Double alpha){
				return new ComputeOperationCelu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[86], input, output, alpha);
			}
		}
		public static final class ComputeOperationAddBias extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAddBias";
			private ComputeOperationAddBias(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationAddBias create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output){
				return new ComputeOperationAddBias(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[87], input, input2, output);
			}
		}
		public static final class ComputeBinding extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeBinding";
			private ComputeBinding(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String src_layer_name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_src_layer_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String src_var_name(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_src_var_name(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String target_var_name(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_target_var_name(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeBinding create(ai.greycat.GreyCat greycat, java.lang.String src_layer_name, java.lang.String src_var_name, java.lang.String target_var_name){
				return new ComputeBinding(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[88], src_layer_name, src_var_name, target_var_name);
			}
		}
		public static final class ComputeActivationSoftmax extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationSoftmax";
			private ComputeActivationSoftmax(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String classes(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_classes(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static ComputeActivationSoftmax create(ai.greycat.GreyCat greycat, java.lang.String classes){
				return new ComputeActivationSoftmax(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[89], classes);
			}
		}
		public static final class ComputeOperationRelu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationRelu";
			private ComputeOperationRelu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double max_value(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_max_value(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double threshold(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_threshold(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static java.lang.Double threshold_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[90];
				return (java.lang.Double) t.static_values[0];
			}
			public static ComputeOperationRelu create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Double max_value, java.lang.Double threshold){
				return new ComputeOperationRelu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[90], input, output, max_value, threshold);
			}
		}
		public static final class ComputeOperationAdd extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAdd";
			private ComputeOperationAdd(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationAdd create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output){
				return new ComputeOperationAdd(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[91], input, input2, output);
			}
		}
		public static final class ComputeOperationLogSoftmax extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationLogSoftmax";
			private ComputeOperationLogSoftmax(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long axis(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_axis(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationLogSoftmax create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Long axis){
				return new ComputeOperationLogSoftmax(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[92], input, output, axis);
			}
		}
		public static final class ComputeOptimizerRmsProp extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerRmsProp";
			private ComputeOptimizerRmsProp(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double decay_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_decay_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double smooth_epsilon(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_smooth_epsilon(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[93];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double decay_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[93];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double smooth_epsilon_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[93];
				return (java.lang.Double) t.static_values[2];
			}
			public static ComputeOptimizerRmsProp create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate, java.lang.Double decay_rate, java.lang.Double smooth_epsilon){
				return new ComputeOptimizerRmsProp(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[93], learning_rate, decay_rate, smooth_epsilon);
			}
		}
		public static final class ComputeOperationArgMin extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationArgMin";
			private ComputeOperationArgMin(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output2(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output2(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationArgMin create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.String output2){
				return new ComputeOperationArgMin(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[94], input, output, output2);
			}
		}
		public static final class ComputeActivationElu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationElu";
			private ComputeActivationElu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double alpha(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_alpha(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static java.lang.Double alpha_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[95];
				return (java.lang.Double) t.static_values[0];
			}
			public static ComputeActivationElu create(ai.greycat.GreyCat greycat, java.lang.Double alpha){
				return new ComputeActivationElu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[95], alpha);
			}
		}
		public static final class ComputeOperationSub extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSub";
			private ComputeOperationSub(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String input2(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_input2(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationSub create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String input2, java.lang.String output){
				return new ComputeOperationSub(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[96], input, input2, output);
			}
		}
		public static final class ComputeOperationFilter extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationFilter";
			private ComputeOperationFilter(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String mask(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_mask(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long nbOutputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_nbOutputs(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static ComputeOperationFilter create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.String mask, java.lang.Long nbOutputs){
				return new ComputeOperationFilter(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[97], input, output, mask, nbOutputs);
			}
		}
		public static final class ComputeOperationSelu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSelu";
			private ComputeOperationSelu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationSelu create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationSelu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[98], input, output);
			}
		}
		public static final class ComputeOptimizerSgd extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerSgd";
			private ComputeOptimizerSgd(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[99];
				return (java.lang.Double) t.static_values[0];
			}
			public static ComputeOptimizerSgd create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate){
				return new ComputeOptimizerSgd(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[99], learning_rate);
			}
		}
		public static final class ComputeInitializer extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializer";
			private ComputeInitializer(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializer create(ai.greycat.GreyCat greycat){
				return new ComputeInitializer(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[100]);
			}
		}
		public static final class ComputeLayerLSTM extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerLSTM";
			private ComputeLayerLSTM(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.compute.ComputeInitializer bias_initializer(){
				return (ai.greycat.algebra.compute.ComputeInitializer)super.get(super.type.generated_offsets[1]);
			}
			public void set_bias_initializer(ai.greycat.algebra.compute.ComputeInitializer v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.compute.ComputeRegularizer weight_regularizer(){
				return (ai.greycat.algebra.compute.ComputeRegularizer)super.get(super.type.generated_offsets[2]);
			}
			public void set_weight_regularizer(ai.greycat.algebra.compute.ComputeRegularizer v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.algebra.compute.ComputeRegularizer bias_regularizer(){
				return (ai.greycat.algebra.compute.ComputeRegularizer)super.get(super.type.generated_offsets[3]);
			}
			public void set_bias_regularizer(ai.greycat.algebra.compute.ComputeRegularizer v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[4]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Boolean use_bias(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[5]);
			}
			public void set_use_bias(java.lang.Boolean v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Boolean return_sequences(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[6]);
			}
			public void set_return_sequences(java.lang.Boolean v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Boolean bidirectional(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[7]);
			}
			public void set_bidirectional(java.lang.Boolean v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Boolean auto_init_states(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[8]);
			}
			public void set_auto_init_states(java.lang.Boolean v){
				super.set(super.type.generated_offsets[8],v);
			}
			public java.lang.Long inputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[9]);
			}
			public void set_inputs(java.lang.Long v){
				super.set(super.type.generated_offsets[9],v);
			}
			public java.lang.Long outputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[10]);
			}
			public void set_outputs(java.lang.Long v){
				super.set(super.type.generated_offsets[10],v);
			}
			public java.lang.Long layers(){
				return (java.lang.Long)super.get(super.type.generated_offsets[11]);
			}
			public void set_layers(java.lang.Long v){
				super.set(super.type.generated_offsets[11],v);
			}
			public java.lang.Long sequences(){
				return (java.lang.Long)super.get(super.type.generated_offsets[12]);
			}
			public void set_sequences(java.lang.Long v){
				super.set(super.type.generated_offsets[12],v);
			}
			public static java.lang.String var_input_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_output_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_hx_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[2];
			}
			public static java.lang.String var_cx_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[3];
			}
			public static java.lang.String var_hy_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[4];
			}
			public static java.lang.String var_cy_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[5];
			}
			public static java.lang.String var_weight_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[6];
			}
			public static java.lang.String var_bias_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[7];
			}
			public static java.lang.String var_internal_i_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[8];
			}
			public static java.lang.String var_internal_f_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[9];
			}
			public static java.lang.String var_internal_cp_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[10];
			}
			public static java.lang.String var_internal_o_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[11];
			}
			public static java.lang.String var_internal_h_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[12];
			}
			public static java.lang.String var_internal_c_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[13];
			}
			public static java.lang.String var_internal_mult_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[14];
			}
			public static java.lang.String var_internal_output_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101];
				return (java.lang.String) t.static_values[15];
			}
			public static ComputeLayerLSTM create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.algebra.compute.ComputeInitializer bias_initializer, ai.greycat.algebra.compute.ComputeRegularizer weight_regularizer, ai.greycat.algebra.compute.ComputeRegularizer bias_regularizer, ai.greycat.std.core.TensorType type, java.lang.Boolean use_bias, java.lang.Boolean return_sequences, java.lang.Boolean bidirectional, java.lang.Boolean auto_init_states, java.lang.Long inputs, java.lang.Long outputs, java.lang.Long layers, java.lang.Long sequences){
				return new ComputeLayerLSTM(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[101], name, bias_initializer, weight_regularizer, bias_regularizer, type, use_bias, return_sequences, bidirectional, auto_init_states, inputs, outputs, layers, sequences);
			}
		}
		public static final class ComputeOptimizerMomentum extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerMomentum";
			private ComputeOptimizerMomentum(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double decay_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_decay_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[102];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double decay_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[102];
				return (java.lang.Double) t.static_values[1];
			}
			public static ComputeOptimizerMomentum create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate, java.lang.Double decay_rate){
				return new ComputeOptimizerMomentum(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[102], learning_rate, decay_rate);
			}
		}
		public static final class ComputeLayerLossRegression extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerLossRegression";
			private ComputeLayerLossRegression(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.compute.ComputeReduction reduction(){
				return (ai.greycat.algebra.compute.ComputeReduction)super.get(super.type.generated_offsets[1]);
			}
			public void set_reduction(ai.greycat.algebra.compute.ComputeReduction v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.compute.ComputeRegressionLoss loss_type(){
				return (ai.greycat.algebra.compute.ComputeRegressionLoss)super.get(super.type.generated_offsets[2]);
			}
			public void set_loss_type(ai.greycat.algebra.compute.ComputeRegressionLoss v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeLayerLossRegression create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.algebra.compute.ComputeReduction reduction, ai.greycat.algebra.compute.ComputeRegressionLoss loss_type){
				return new ComputeLayerLossRegression(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[103], name, reduction, loss_type);
			}
		}
		public static final class ComputeOperationSqrt extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSqrt";
			private ComputeOperationSqrt(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationSqrt create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationSqrt(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[104], input, output);
			}
		}
		public static final class ComputeOptimizerAdam extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerAdam";
			private ComputeOptimizerAdam(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double beta1(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_beta1(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double beta2(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_beta2(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double smooth_epsilon(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_smooth_epsilon(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[105];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double beta1_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[105];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double beta2_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[105];
				return (java.lang.Double) t.static_values[2];
			}
			public static java.lang.Double smooth_epsilon_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[105];
				return (java.lang.Double) t.static_values[3];
			}
			public static ComputeOptimizerAdam create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate, java.lang.Double beta1, java.lang.Double beta2, java.lang.Double smooth_epsilon){
				return new ComputeOptimizerAdam(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[105], learning_rate, beta1, beta2, smooth_epsilon);
			}
		}
		public static final class ComputeOperationSign extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSign";
			private ComputeOperationSign(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationSign create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationSign(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[106], input, output);
			}
		}
		public static final class ComputeActivationSigmoid extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationSigmoid";
			private ComputeActivationSigmoid(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeActivationSigmoid create(ai.greycat.GreyCat greycat){
				return new ComputeActivationSigmoid(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[107]);
			}
		}
		public static final class ComputeLayerLinear extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerLinear";
			private ComputeLayerLinear(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long inputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_inputs(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long outputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_outputs(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Boolean use_bias(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[4]);
			}
			public void set_use_bias(java.lang.Boolean v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.algebra.compute.ComputeInitializer weight_initializer(){
				return (ai.greycat.algebra.compute.ComputeInitializer)super.get(super.type.generated_offsets[5]);
			}
			public void set_weight_initializer(ai.greycat.algebra.compute.ComputeInitializer v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.algebra.compute.ComputeRegularizer weight_regularizer(){
				return (ai.greycat.algebra.compute.ComputeRegularizer)super.get(super.type.generated_offsets[6]);
			}
			public void set_weight_regularizer(ai.greycat.algebra.compute.ComputeRegularizer v){
				super.set(super.type.generated_offsets[6],v);
			}
			public ai.greycat.algebra.compute.ComputeInitializer bias_initializer(){
				return (ai.greycat.algebra.compute.ComputeInitializer)super.get(super.type.generated_offsets[7]);
			}
			public void set_bias_initializer(ai.greycat.algebra.compute.ComputeInitializer v){
				super.set(super.type.generated_offsets[7],v);
			}
			public ai.greycat.algebra.compute.ComputeRegularizer bias_regularizer(){
				return (ai.greycat.algebra.compute.ComputeRegularizer)super.get(super.type.generated_offsets[8]);
			}
			public void set_bias_regularizer(ai.greycat.algebra.compute.ComputeRegularizer v){
				super.set(super.type.generated_offsets[8],v);
			}
			public static java.lang.String var_input_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[108];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_output_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[108];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_weight_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[108];
				return (java.lang.String) t.static_values[2];
			}
			public static java.lang.String var_bias_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[108];
				return (java.lang.String) t.static_values[3];
			}
			public static java.lang.String var_mult_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[108];
				return (java.lang.String) t.static_values[4];
			}
			public static ComputeLayerLinear create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.TensorType type, java.lang.Long inputs, java.lang.Long outputs, java.lang.Boolean use_bias, ai.greycat.algebra.compute.ComputeInitializer weight_initializer, ai.greycat.algebra.compute.ComputeRegularizer weight_regularizer, ai.greycat.algebra.compute.ComputeInitializer bias_initializer, ai.greycat.algebra.compute.ComputeRegularizer bias_regularizer){
				return new ComputeLayerLinear(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[108], name, type, inputs, outputs, use_bias, weight_initializer, weight_regularizer, bias_initializer, bias_regularizer);
			}
		}
		public static final class ComputeInitializerNone extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerNone";
			private ComputeInitializerNone(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerNone create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerNone(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[109]);
			}
		}
		public static final class ComputeInitializerNormalAvg extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerNormalAvg";
			private ComputeInitializerNormalAvg(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerNormalAvg create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerNormalAvg(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[110]);
			}
		}
		public static final class ComputeInitializerSigmoidUniform extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerSigmoidUniform";
			private ComputeInitializerSigmoidUniform(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerSigmoidUniform create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerSigmoidUniform(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[111]);
			}
		}
		public static final class ComputeOperationLeakyRelu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationLeakyRelu";
			private ComputeOperationLeakyRelu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double alpha(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_alpha(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double max_value(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_max_value(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Double threshold(){
				return (java.lang.Double)super.get(super.type.generated_offsets[4]);
			}
			public void set_threshold(java.lang.Double v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static java.lang.Double alpha_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[112];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double max_value_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[112];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double threshold_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[112];
				return (java.lang.Double) t.static_values[2];
			}
			public static ComputeOperationLeakyRelu create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Double alpha, java.lang.Double max_value, java.lang.Double threshold){
				return new ComputeOperationLeakyRelu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[112], input, output, alpha, max_value, threshold);
			}
		}
		public static final class ComputeActivationExp extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationExp";
			private ComputeActivationExp(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeActivationExp create(ai.greycat.GreyCat greycat){
				return new ComputeActivationExp(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[113]);
			}
		}
		public static final class ComputeOperationSum extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationSum";
			private ComputeOperationSum(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long axis(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_axis(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationSum create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Long axis){
				return new ComputeOperationSum(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[114], input, output, axis);
			}
		}
		public static final class ComputeOperationAtan extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAtan";
			private ComputeOperationAtan(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationAtan create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationAtan(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[115], input, output);
			}
		}
		public static final class ComputeInitializerUniformAvg extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerUniformAvg";
			private ComputeInitializerUniformAvg(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerUniformAvg create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerUniformAvg(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[116]);
			}
		}
		public static final class ComputeInitializerReluUniform extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerReluUniform";
			private ComputeInitializerReluUniform(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerReluUniform create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerReluUniform(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[117]);
			}
		}
		public static final class ComputeLayerFilter extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerFilter";
			private ComputeLayerFilter(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.TensorType type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[1]);
			}
			public void set_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long inputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_inputs(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long outputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_outputs(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.core.Array<java.lang.Long> maskValues(){
				return (ai.greycat.std.core.Array<java.lang.Long>)super.get(super.type.generated_offsets[4]);
			}
			public void set_maskValues(ai.greycat.std.core.Array<java.lang.Long> v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static java.lang.String var_input_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[118];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_output_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[118];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_mask_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[118];
				return (java.lang.String) t.static_values[2];
			}
			public static ComputeLayerFilter create(ai.greycat.GreyCat greycat, java.lang.String name, ai.greycat.std.core.TensorType type, java.lang.Long inputs, java.lang.Long outputs, ai.greycat.std.core.Array<java.lang.Long> maskValues){
				return new ComputeLayerFilter(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[118], name, type, inputs, outputs, maskValues);
			}
		}
		public static final class ComputeRegressionLoss extends GreyCat.Enum {
			public static final java.lang.String name = "compute::ComputeRegressionLoss";
			private ComputeRegressionLoss(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.compute.ComputeRegressionLoss square(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[119];
				return (ai.greycat.algebra.compute.ComputeRegressionLoss) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.compute.ComputeRegressionLoss abs(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[119];
				return (ai.greycat.algebra.compute.ComputeRegressionLoss) t.enum_values[t.generated_offsets[1]];
			}
			public static ComputeRegressionLoss create(ai.greycat.GreyCat greycat){
				return new ComputeRegressionLoss(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[119]);
			}
		}
		public static final class ComputeInitializerPytorch extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerPytorch";
			private ComputeInitializerPytorch(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ComputeInitializerPytorch create(ai.greycat.GreyCat greycat){
				return new ComputeInitializerPytorch(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[120]);
			}
		}
		public static final class ComputeOptimizerFtrl extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOptimizerFtrl";
			private ComputeOptimizerFtrl(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double learning_rate(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_learning_rate(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double lambda1(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_lambda1(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double lambda2(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_lambda2(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double beta(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_beta(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static java.lang.Double learning_rate_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[121];
				return (java.lang.Double) t.static_values[0];
			}
			public static java.lang.Double beta_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[121];
				return (java.lang.Double) t.static_values[1];
			}
			public static java.lang.Double lambda1_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[121];
				return (java.lang.Double) t.static_values[2];
			}
			public static java.lang.Double lambda2_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[121];
				return (java.lang.Double) t.static_values[3];
			}
			public static ComputeOptimizerFtrl create(ai.greycat.GreyCat greycat, java.lang.Double learning_rate, java.lang.Double lambda1, java.lang.Double lambda2, java.lang.Double beta){
				return new ComputeOptimizerFtrl(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[121], learning_rate, lambda1, lambda2, beta);
			}
		}
		public static final class ComputeOperationAcosh extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationAcosh";
			private ComputeOperationAcosh(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationAcosh create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationAcosh(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[122], input, output);
			}
		}
		public static final class ComputeOperationCosh extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationCosh";
			private ComputeOperationCosh(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeOperationCosh create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output){
				return new ComputeOperationCosh(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[123], input, output);
			}
		}
		public static final class ComputeOperationScale extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeOperationScale";
			private ComputeOperationScale(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String input(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_input(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String output(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_output(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double alpha(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_alpha(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ComputeOperationScale create(ai.greycat.GreyCat greycat, java.lang.String input, java.lang.String output, java.lang.Double alpha){
				return new ComputeOperationScale(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[124], input, output, alpha);
			}
		}
		public static final class ComputeInitializerUniform extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeInitializerUniform";
			private ComputeInitializerUniform(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double min(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_min(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double max(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_max(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeInitializerUniform create(ai.greycat.GreyCat greycat, java.lang.Double min, java.lang.Double max){
				return new ComputeInitializerUniform(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[125], min, max);
			}
		}
		public static final class ComputeActivationRelu extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeActivationRelu";
			private ComputeActivationRelu(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double max_value(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_max_value(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double threshold(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_threshold(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static java.lang.Double threshold_def(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[126];
				return (java.lang.Double) t.static_values[0];
			}
			public static ComputeActivationRelu create(ai.greycat.GreyCat greycat, java.lang.Double max_value, java.lang.Double threshold){
				return new ComputeActivationRelu(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[126], max_value, threshold);
			}
		}
		public static final class ComputeLayerCall extends GreyCat.Object {
			public static final java.lang.String name = "compute::ComputeLayerCall";
			private ComputeLayerCall(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String layer_name(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_layer_name(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeBinding> bindings(){
				return (ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeBinding>)super.get(super.type.generated_offsets[1]);
			}
			public void set_bindings(ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeBinding> v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ComputeLayerCall create(ai.greycat.GreyCat greycat, java.lang.String layer_name, ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeBinding> bindings){
				return new ComputeLayerCall(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[127], layer_name, bindings);
			}
		}
		public static final class ComputeEngine extends ai.greycat.algebra_n.compute.ComputeEngine {
			public static final java.lang.String name = "compute::ComputeEngine";
			private ComputeEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static ComputeEngine create(ai.greycat.GreyCat greycat){
				return new ComputeEngine(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[128]);
			}
		}
	}
	public static final class nn_layers_names {
		public static final class NNLayersNames extends GreyCat.Enum {
			public static final java.lang.String name = "nn_layers_names::NNLayersNames";
			private NNLayersNames(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_0(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_1(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_2(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_3(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_4(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_5(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[5]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_6(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[6]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_7(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[7]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_8(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[8]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_9(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[9]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_10(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[10]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_11(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[11]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_12(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[12]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_13(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[13]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_14(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[14]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_15(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[15]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_16(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[16]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_17(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[17]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_18(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[18]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_19(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[19]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_20(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[20]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_21(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[21]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_22(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[22]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_23(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[23]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_24(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[24]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_25(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[25]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_26(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[26]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_27(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[27]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_28(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[28]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_29(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[29]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_30(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[30]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_31(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[31]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_32(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[32]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_33(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[33]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_34(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[34]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_35(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[35]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_36(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[36]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_37(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[37]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_38(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[38]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_39(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[39]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_40(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[40]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_41(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[41]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_42(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[42]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_43(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[43]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_44(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[44]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_45(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[45]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_46(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[46]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_47(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[47]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_48(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[48]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_49(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[49]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_50(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[50]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_51(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[51]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_52(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[52]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_53(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[53]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_54(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[54]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_55(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[55]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_56(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[56]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_57(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[57]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_58(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[58]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_59(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[59]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_60(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[60]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_61(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[61]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_62(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[62]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_63(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[63]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_64(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[64]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_65(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[65]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_66(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[66]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_67(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[67]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_68(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[68]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_69(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[69]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_70(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[70]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_71(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[71]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_72(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[72]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_73(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[73]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_74(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[74]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_75(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[75]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_76(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[76]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_77(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[77]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_78(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[78]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_79(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[79]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_80(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[80]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_81(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[81]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_82(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[82]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_83(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[83]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_84(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[84]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_85(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[85]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_86(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[86]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_87(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[87]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_88(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[88]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_89(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[89]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_90(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[90]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_91(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[91]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_92(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[92]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_93(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[93]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_94(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[94]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_95(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[95]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_96(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[96]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_97(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[97]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_98(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[98]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_99(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[99]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_100(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[100]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_101(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[101]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_102(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[102]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_103(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[103]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_104(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[104]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_105(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[105]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_106(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[106]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_107(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[107]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_108(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[108]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_109(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[109]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_110(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[110]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_111(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[111]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_112(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[112]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_113(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[113]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_114(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[114]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_115(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[115]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_116(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[116]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_117(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[117]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_118(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[118]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_119(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[119]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_120(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[120]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_121(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[121]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_122(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[122]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_123(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[123]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_124(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[124]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_125(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[125]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_126(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[126]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_127(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[127]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_128(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[128]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_129(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[129]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_130(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[130]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_131(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[131]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_132(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[132]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_133(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[133]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_134(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[134]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_135(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[135]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_136(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[136]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_137(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[137]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_138(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[138]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_139(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[139]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_140(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[140]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_141(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[141]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_142(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[142]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_143(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[143]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_144(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[144]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_145(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[145]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_146(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[146]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_147(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[147]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_148(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[148]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_149(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[149]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_150(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[150]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_151(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[151]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_152(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[152]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_153(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[153]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_154(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[154]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_155(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[155]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_156(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[156]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_157(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[157]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_158(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[158]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_159(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[159]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_160(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[160]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_161(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[161]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_162(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[162]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_163(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[163]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_164(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[164]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_165(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[165]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_166(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[166]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_167(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[167]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_168(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[168]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_169(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[169]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_170(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[170]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_171(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[171]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_172(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[172]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_173(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[173]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_174(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[174]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_175(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[175]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_176(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[176]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_177(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[177]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_178(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[178]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_179(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[179]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_180(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[180]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_181(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[181]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_182(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[182]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_183(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[183]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_184(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[184]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_185(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[185]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_186(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[186]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_187(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[187]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_188(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[188]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_189(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[189]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_190(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[190]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_191(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[191]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_192(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[192]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_193(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[193]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_194(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[194]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_195(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[195]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_196(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[196]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_197(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[197]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_198(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[198]];
			}
			public static ai.greycat.algebra.nn_layers_names.NNLayersNames layer_199(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129];
				return (ai.greycat.algebra.nn_layers_names.NNLayersNames) t.enum_values[t.generated_offsets[199]];
			}
			public static NNLayersNames create(ai.greycat.GreyCat greycat){
				return new NNLayersNames(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[129]);
			}
		}
	}
	public static final class nn {
		public static final class AutoEncoderNetwork extends GreyCat.Object {
			public static final java.lang.String name = "nn::AutoEncoderNetwork";
			private AutoEncoderNetwork(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long inputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_inputs(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean inputs_gradients(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_inputs_gradients(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long outputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_outputs(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long fixed_batch_size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_fixed_batch_size(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long inputs_sequences(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_inputs_sequences(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Long outputs_sequences(){
				return (java.lang.Long)super.get(super.type.generated_offsets[5]);
			}
			public void set_outputs_sequences(java.lang.Long v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.TensorType tensor_type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[6]);
			}
			public void set_tensor_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Long seed(){
				return (java.lang.Long)super.get(super.type.generated_offsets[7]);
			}
			public void set_seed(java.lang.Long v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Boolean randomizeSeed(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[8]);
			}
			public void set_randomizeSeed(java.lang.Boolean v){
				super.set(super.type.generated_offsets[8],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers(){
				return (ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer>)super.get(super.type.generated_offsets[9]);
			}
			public void set_layers(ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> v){
				super.set(super.type.generated_offsets[9],v);
			}
			public ai.greycat.algebra.nn.PreProcessType preProcessType(){
				return (ai.greycat.algebra.nn.PreProcessType)super.get(super.type.generated_offsets[10]);
			}
			public void set_preProcessType(ai.greycat.algebra.nn.PreProcessType v){
				super.set(super.type.generated_offsets[10],v);
			}
			public java.lang.Object preProcessObject(){
				return super.get(super.type.generated_offsets[11]);
			}
			public void set_preProcessObject(java.lang.Object v){
				super.set(super.type.generated_offsets[11],v);
			}
			public ai.greycat.algebra.nn.PostProcessType postProcessType(){
				return (ai.greycat.algebra.nn.PostProcessType)super.get(super.type.generated_offsets[12]);
			}
			public void set_postProcessType(ai.greycat.algebra.nn.PostProcessType v){
				super.set(super.type.generated_offsets[12],v);
			}
			public java.lang.Object postProcessObject(){
				return super.get(super.type.generated_offsets[13]);
			}
			public void set_postProcessObject(java.lang.Object v){
				super.set(super.type.generated_offsets[13],v);
			}
			public ai.greycat.algebra.compute.ComputeOptimizer optimizer(){
				return (ai.greycat.algebra.compute.ComputeOptimizer)super.get(super.type.generated_offsets[14]);
			}
			public void set_optimizer(ai.greycat.algebra.compute.ComputeOptimizer v){
				super.set(super.type.generated_offsets[14],v);
			}
			public ai.greycat.algebra.compute.ComputeLayerLoss lossLayer(){
				return (ai.greycat.algebra.compute.ComputeLayerLoss)super.get(super.type.generated_offsets[15]);
			}
			public void set_lossLayer(ai.greycat.algebra.compute.ComputeLayerLoss v){
				super.set(super.type.generated_offsets[15],v);
			}
			public java.lang.String _lastLayer(){
				return (java.lang.String)super.get(super.type.generated_offsets[16]);
			}
			public void set__lastLayer(java.lang.String v){
				super.set(super.type.generated_offsets[16],v);
			}
			public java.lang.String _lastOutput(){
				return (java.lang.String)super.get(super.type.generated_offsets[17]);
			}
			public void set__lastOutput(java.lang.String v){
				super.set(super.type.generated_offsets[17],v);
			}
			public java.lang.Long encoder_layer_idx(){
				return (java.lang.Long)super.get(super.type.generated_offsets[18]);
			}
			public void set_encoder_layer_idx(java.lang.Long v){
				super.set(super.type.generated_offsets[18],v);
			}
			public java.lang.String encoder_layer_name(){
				return (java.lang.String)super.get(super.type.generated_offsets[19]);
			}
			public void set_encoder_layer_name(java.lang.String v){
				super.set(super.type.generated_offsets[19],v);
			}
			public java.lang.String encoder_layer_var(){
				return (java.lang.String)super.get(super.type.generated_offsets[20]);
			}
			public void set_encoder_layer_var(java.lang.String v){
				super.set(super.type.generated_offsets[20],v);
			}
			public static AutoEncoderNetwork create(ai.greycat.GreyCat greycat, java.lang.Long inputs, java.lang.Boolean inputs_gradients, java.lang.Long outputs, java.lang.Long fixed_batch_size, java.lang.Long inputs_sequences, java.lang.Long outputs_sequences, ai.greycat.std.core.TensorType tensor_type, java.lang.Long seed, java.lang.Boolean randomizeSeed, ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers, ai.greycat.algebra.nn.PreProcessType preProcessType, java.lang.Object preProcessObject, ai.greycat.algebra.nn.PostProcessType postProcessType, java.lang.Object postProcessObject, ai.greycat.algebra.compute.ComputeOptimizer optimizer, ai.greycat.algebra.compute.ComputeLayerLoss lossLayer, java.lang.String _lastLayer, java.lang.String _lastOutput, java.lang.Long encoder_layer_idx, java.lang.String encoder_layer_name, java.lang.String encoder_layer_var){
				return new AutoEncoderNetwork(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[130], inputs, inputs_gradients, outputs, fixed_batch_size, inputs_sequences, outputs_sequences, tensor_type, seed, randomizeSeed, layers, preProcessType, preProcessObject, postProcessType, postProcessObject, optimizer, lossLayer, _lastLayer, _lastOutput, encoder_layer_idx, encoder_layer_name, encoder_layer_var);
			}
		}
		public static final class InitializerConfig extends GreyCat.Object {
			public static final java.lang.String name = "nn::InitializerConfig";
			private InitializerConfig(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.algebra.compute.ComputeInitializer weight_initializer(){
				return (ai.greycat.algebra.compute.ComputeInitializer)super.get(super.type.generated_offsets[0]);
			}
			public void set_weight_initializer(ai.greycat.algebra.compute.ComputeInitializer v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.compute.ComputeRegularizer weight_regularizer(){
				return (ai.greycat.algebra.compute.ComputeRegularizer)super.get(super.type.generated_offsets[1]);
			}
			public void set_weight_regularizer(ai.greycat.algebra.compute.ComputeRegularizer v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.compute.ComputeInitializer bias_initializer(){
				return (ai.greycat.algebra.compute.ComputeInitializer)super.get(super.type.generated_offsets[2]);
			}
			public void set_bias_initializer(ai.greycat.algebra.compute.ComputeInitializer v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.algebra.compute.ComputeRegularizer bias_regularizer(){
				return (ai.greycat.algebra.compute.ComputeRegularizer)super.get(super.type.generated_offsets[3]);
			}
			public void set_bias_regularizer(ai.greycat.algebra.compute.ComputeRegularizer v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static InitializerConfig create(ai.greycat.GreyCat greycat, ai.greycat.algebra.compute.ComputeInitializer weight_initializer, ai.greycat.algebra.compute.ComputeRegularizer weight_regularizer, ai.greycat.algebra.compute.ComputeInitializer bias_initializer, ai.greycat.algebra.compute.ComputeRegularizer bias_regularizer){
				return new InitializerConfig(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[131], weight_initializer, weight_regularizer, bias_initializer, bias_regularizer);
			}
		}
		public static final class ComputeInitializers extends GreyCat.Enum {
			public static final java.lang.String name = "nn::ComputeInitializers";
			private ComputeInitializers(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.nn.ComputeInitializers none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers constant(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers sigmoid_uniform(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers lecun_uniform(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers xavier(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers xavier_uniform(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[5]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers relu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[6]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers relu_uniform(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[7]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers normal(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[8]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers normal_in(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[9]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers normal_out(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[10]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers normal_avg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[11]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers uniform(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[12]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers uniform_in(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[13]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers uniform_out(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[14]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers uniform_avg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[15]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers identity(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[16]];
			}
			public static ai.greycat.algebra.nn.ComputeInitializers pytorch(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132];
				return (ai.greycat.algebra.nn.ComputeInitializers) t.enum_values[t.generated_offsets[17]];
			}
			public static ComputeInitializers create(ai.greycat.GreyCat greycat){
				return new ComputeInitializers(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[132]);
			}
		}
		public static final class ComputeOptimizers extends GreyCat.Enum {
			public static final java.lang.String name = "nn::ComputeOptimizers";
			private ComputeOptimizers(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers ada_delta(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers ada_grad(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers adam(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers ada_max(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers nadam(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers ftrl(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[5]];
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers sgd(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[6]];
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers rms_prop(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[7]];
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers momentum(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[8]];
			}
			public static ai.greycat.algebra.nn.ComputeOptimizers nesterov(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133];
				return (ai.greycat.algebra.nn.ComputeOptimizers) t.enum_values[t.generated_offsets[9]];
			}
			public static ComputeOptimizers create(ai.greycat.GreyCat greycat){
				return new ComputeOptimizers(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[133]);
			}
		}
		public static final class NeuralNetwork extends GreyCat.Object {
			public static final java.lang.String name = "nn::NeuralNetwork";
			private NeuralNetwork(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long inputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_inputs(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean inputs_gradients(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_inputs_gradients(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long outputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_outputs(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long fixed_batch_size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_fixed_batch_size(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long inputs_sequences(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_inputs_sequences(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Long outputs_sequences(){
				return (java.lang.Long)super.get(super.type.generated_offsets[5]);
			}
			public void set_outputs_sequences(java.lang.Long v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.TensorType tensor_type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[6]);
			}
			public void set_tensor_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Long seed(){
				return (java.lang.Long)super.get(super.type.generated_offsets[7]);
			}
			public void set_seed(java.lang.Long v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Boolean randomizeSeed(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[8]);
			}
			public void set_randomizeSeed(java.lang.Boolean v){
				super.set(super.type.generated_offsets[8],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers(){
				return (ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer>)super.get(super.type.generated_offsets[9]);
			}
			public void set_layers(ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> v){
				super.set(super.type.generated_offsets[9],v);
			}
			public ai.greycat.algebra.nn.PreProcessType preProcessType(){
				return (ai.greycat.algebra.nn.PreProcessType)super.get(super.type.generated_offsets[10]);
			}
			public void set_preProcessType(ai.greycat.algebra.nn.PreProcessType v){
				super.set(super.type.generated_offsets[10],v);
			}
			public java.lang.Object preProcessObject(){
				return super.get(super.type.generated_offsets[11]);
			}
			public void set_preProcessObject(java.lang.Object v){
				super.set(super.type.generated_offsets[11],v);
			}
			public ai.greycat.algebra.nn.PostProcessType postProcessType(){
				return (ai.greycat.algebra.nn.PostProcessType)super.get(super.type.generated_offsets[12]);
			}
			public void set_postProcessType(ai.greycat.algebra.nn.PostProcessType v){
				super.set(super.type.generated_offsets[12],v);
			}
			public java.lang.Object postProcessObject(){
				return super.get(super.type.generated_offsets[13]);
			}
			public void set_postProcessObject(java.lang.Object v){
				super.set(super.type.generated_offsets[13],v);
			}
			public ai.greycat.algebra.compute.ComputeOptimizer optimizer(){
				return (ai.greycat.algebra.compute.ComputeOptimizer)super.get(super.type.generated_offsets[14]);
			}
			public void set_optimizer(ai.greycat.algebra.compute.ComputeOptimizer v){
				super.set(super.type.generated_offsets[14],v);
			}
			public ai.greycat.algebra.compute.ComputeLayerLoss lossLayer(){
				return (ai.greycat.algebra.compute.ComputeLayerLoss)super.get(super.type.generated_offsets[15]);
			}
			public void set_lossLayer(ai.greycat.algebra.compute.ComputeLayerLoss v){
				super.set(super.type.generated_offsets[15],v);
			}
			public java.lang.String _lastLayer(){
				return (java.lang.String)super.get(super.type.generated_offsets[16]);
			}
			public void set__lastLayer(java.lang.String v){
				super.set(super.type.generated_offsets[16],v);
			}
			public java.lang.String _lastOutput(){
				return (java.lang.String)super.get(super.type.generated_offsets[17]);
			}
			public void set__lastOutput(java.lang.String v){
				super.set(super.type.generated_offsets[17],v);
			}
			public static java.lang.String err_negative_in_out(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String err_last_layer_wrong(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String err_incompatible_loss(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[2];
			}
			public static java.lang.String err_layer_not_supported(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[3];
			}
			public static java.lang.String err_tensor_type_not_supported(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[4];
			}
			public static java.lang.String err_minimum_layers(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[5];
			}
			public static java.lang.String layer_placeholders_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[6];
			}
			public static java.lang.String layer_classification_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[7];
			}
			public static java.lang.String layer_preprocess_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[8];
			}
			public static java.lang.String layer_postprocess_learn_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[9];
			}
			public static java.lang.String layer_main_layers_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[10];
			}
			public static java.lang.String layer_loss_learn_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[11];
			}
			public static java.lang.String layer_loss_display_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[12];
			}
			public static java.lang.String layer_postprocess_display_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[13];
			}
			public static java.lang.String layer_confusion_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[14];
			}
			public static java.lang.String seq_predict(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[15];
			}
			public static java.lang.String seq_post_process(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[16];
			}
			public static java.lang.String seq_learn(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[17];
			}
			public static java.lang.String seq_loss_display(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[18];
			}
			public static java.lang.String seq_encode(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[19];
			}
			public static java.lang.String seq_decode(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[20];
			}
			public static java.lang.String seq_confusion(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[21];
			}
			public static java.lang.String var_inputs_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[22];
			}
			public static java.lang.String var_enc_inputs_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[23];
			}
			public static java.lang.String var_targets_name(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[24];
			}
			public static java.lang.String var_classifier_classes(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[25];
			}
			public static java.lang.String var_classifier_probabilities(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[26];
			}
			public static java.lang.String var_classifier_class_weights(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[27];
			}
			public static java.lang.String var_classifier_confusion(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[28];
			}
			public static java.lang.String var_input_avg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[29];
			}
			public static java.lang.String var_input_min(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[30];
			}
			public static java.lang.String var_input_max(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[31];
			}
			public static java.lang.String var_input_std(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[32];
			}
			public static java.lang.String var_input_space(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[33];
			}
			public static java.lang.String var_output_avg(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[34];
			}
			public static java.lang.String var_output_min(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[35];
			}
			public static java.lang.String var_output_max(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[36];
			}
			public static java.lang.String var_output_std(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134];
				return (java.lang.String) t.static_values[37];
			}
			public static NeuralNetwork create(ai.greycat.GreyCat greycat, java.lang.Long inputs, java.lang.Boolean inputs_gradients, java.lang.Long outputs, java.lang.Long fixed_batch_size, java.lang.Long inputs_sequences, java.lang.Long outputs_sequences, ai.greycat.std.core.TensorType tensor_type, java.lang.Long seed, java.lang.Boolean randomizeSeed, ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers, ai.greycat.algebra.nn.PreProcessType preProcessType, java.lang.Object preProcessObject, ai.greycat.algebra.nn.PostProcessType postProcessType, java.lang.Object postProcessObject, ai.greycat.algebra.compute.ComputeOptimizer optimizer, ai.greycat.algebra.compute.ComputeLayerLoss lossLayer, java.lang.String _lastLayer, java.lang.String _lastOutput){
				return new NeuralNetwork(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[134], inputs, inputs_gradients, outputs, fixed_batch_size, inputs_sequences, outputs_sequences, tensor_type, seed, randomizeSeed, layers, preProcessType, preProcessObject, postProcessType, postProcessObject, optimizer, lossLayer, _lastLayer, _lastOutput);
			}
		}
		public static final class ComputeLayerTypes extends GreyCat.Enum {
			public static final java.lang.String name = "nn::ComputeLayerTypes";
			private ComputeLayerTypes(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.nn.ComputeLayerTypes linear(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[135];
				return (ai.greycat.algebra.nn.ComputeLayerTypes) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.nn.ComputeLayerTypes dense(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[135];
				return (ai.greycat.algebra.nn.ComputeLayerTypes) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.nn.ComputeLayerTypes activation(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[135];
				return (ai.greycat.algebra.nn.ComputeLayerTypes) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.nn.ComputeLayerTypes lstm(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[135];
				return (ai.greycat.algebra.nn.ComputeLayerTypes) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.algebra.nn.ComputeLayerTypes loss(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[135];
				return (ai.greycat.algebra.nn.ComputeLayerTypes) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.algebra.nn.ComputeLayerTypes filter(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[135];
				return (ai.greycat.algebra.nn.ComputeLayerTypes) t.enum_values[t.generated_offsets[5]];
			}
			public static ComputeLayerTypes create(ai.greycat.GreyCat greycat){
				return new ComputeLayerTypes(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[135]);
			}
		}
		public static final class ClassificationNetwork extends GreyCat.Object {
			public static final java.lang.String name = "nn::ClassificationNetwork";
			private ClassificationNetwork(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long inputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_inputs(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean inputs_gradients(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_inputs_gradients(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long outputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_outputs(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long fixed_batch_size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_fixed_batch_size(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long inputs_sequences(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_inputs_sequences(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Long outputs_sequences(){
				return (java.lang.Long)super.get(super.type.generated_offsets[5]);
			}
			public void set_outputs_sequences(java.lang.Long v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.TensorType tensor_type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[6]);
			}
			public void set_tensor_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Long seed(){
				return (java.lang.Long)super.get(super.type.generated_offsets[7]);
			}
			public void set_seed(java.lang.Long v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Boolean randomizeSeed(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[8]);
			}
			public void set_randomizeSeed(java.lang.Boolean v){
				super.set(super.type.generated_offsets[8],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers(){
				return (ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer>)super.get(super.type.generated_offsets[9]);
			}
			public void set_layers(ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> v){
				super.set(super.type.generated_offsets[9],v);
			}
			public ai.greycat.algebra.nn.PreProcessType preProcessType(){
				return (ai.greycat.algebra.nn.PreProcessType)super.get(super.type.generated_offsets[10]);
			}
			public void set_preProcessType(ai.greycat.algebra.nn.PreProcessType v){
				super.set(super.type.generated_offsets[10],v);
			}
			public java.lang.Object preProcessObject(){
				return super.get(super.type.generated_offsets[11]);
			}
			public void set_preProcessObject(java.lang.Object v){
				super.set(super.type.generated_offsets[11],v);
			}
			public ai.greycat.algebra.nn.PostProcessType postProcessType(){
				return (ai.greycat.algebra.nn.PostProcessType)super.get(super.type.generated_offsets[12]);
			}
			public void set_postProcessType(ai.greycat.algebra.nn.PostProcessType v){
				super.set(super.type.generated_offsets[12],v);
			}
			public java.lang.Object postProcessObject(){
				return super.get(super.type.generated_offsets[13]);
			}
			public void set_postProcessObject(java.lang.Object v){
				super.set(super.type.generated_offsets[13],v);
			}
			public ai.greycat.algebra.compute.ComputeOptimizer optimizer(){
				return (ai.greycat.algebra.compute.ComputeOptimizer)super.get(super.type.generated_offsets[14]);
			}
			public void set_optimizer(ai.greycat.algebra.compute.ComputeOptimizer v){
				super.set(super.type.generated_offsets[14],v);
			}
			public ai.greycat.algebra.compute.ComputeLayerLoss lossLayer(){
				return (ai.greycat.algebra.compute.ComputeLayerLoss)super.get(super.type.generated_offsets[15]);
			}
			public void set_lossLayer(ai.greycat.algebra.compute.ComputeLayerLoss v){
				super.set(super.type.generated_offsets[15],v);
			}
			public java.lang.String _lastLayer(){
				return (java.lang.String)super.get(super.type.generated_offsets[16]);
			}
			public void set__lastLayer(java.lang.String v){
				super.set(super.type.generated_offsets[16],v);
			}
			public java.lang.String _lastOutput(){
				return (java.lang.String)super.get(super.type.generated_offsets[17]);
			}
			public void set__lastOutput(java.lang.String v){
				super.set(super.type.generated_offsets[17],v);
			}
			public java.lang.Boolean calculate_probabilities(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[18]);
			}
			public void set_calculate_probabilities(java.lang.Boolean v){
				super.set(super.type.generated_offsets[18],v);
			}
			public java.lang.Boolean has_class_weights(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[19]);
			}
			public void set_has_class_weights(java.lang.Boolean v){
				super.set(super.type.generated_offsets[19],v);
			}
			public java.lang.Boolean from_logits(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[20]);
			}
			public void set_from_logits(java.lang.Boolean v){
				super.set(super.type.generated_offsets[20],v);
			}
			public static ClassificationNetwork create(ai.greycat.GreyCat greycat, java.lang.Long inputs, java.lang.Boolean inputs_gradients, java.lang.Long outputs, java.lang.Long fixed_batch_size, java.lang.Long inputs_sequences, java.lang.Long outputs_sequences, ai.greycat.std.core.TensorType tensor_type, java.lang.Long seed, java.lang.Boolean randomizeSeed, ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers, ai.greycat.algebra.nn.PreProcessType preProcessType, java.lang.Object preProcessObject, ai.greycat.algebra.nn.PostProcessType postProcessType, java.lang.Object postProcessObject, ai.greycat.algebra.compute.ComputeOptimizer optimizer, ai.greycat.algebra.compute.ComputeLayerLoss lossLayer, java.lang.String _lastLayer, java.lang.String _lastOutput, java.lang.Boolean calculate_probabilities, java.lang.Boolean has_class_weights, java.lang.Boolean from_logits){
				return new ClassificationNetwork(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[136], inputs, inputs_gradients, outputs, fixed_batch_size, inputs_sequences, outputs_sequences, tensor_type, seed, randomizeSeed, layers, preProcessType, preProcessObject, postProcessType, postProcessObject, optimizer, lossLayer, _lastLayer, _lastOutput, calculate_probabilities, has_class_weights, from_logits);
			}
		}
		public static final class RegressionNetwork extends GreyCat.Object {
			public static final java.lang.String name = "nn::RegressionNetwork";
			private RegressionNetwork(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long inputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_inputs(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean inputs_gradients(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_inputs_gradients(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Long outputs(){
				return (java.lang.Long)super.get(super.type.generated_offsets[2]);
			}
			public void set_outputs(java.lang.Long v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long fixed_batch_size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_fixed_batch_size(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long inputs_sequences(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_inputs_sequences(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Long outputs_sequences(){
				return (java.lang.Long)super.get(super.type.generated_offsets[5]);
			}
			public void set_outputs_sequences(java.lang.Long v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.TensorType tensor_type(){
				return (ai.greycat.std.core.TensorType)super.get(super.type.generated_offsets[6]);
			}
			public void set_tensor_type(ai.greycat.std.core.TensorType v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Long seed(){
				return (java.lang.Long)super.get(super.type.generated_offsets[7]);
			}
			public void set_seed(java.lang.Long v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Boolean randomizeSeed(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[8]);
			}
			public void set_randomizeSeed(java.lang.Boolean v){
				super.set(super.type.generated_offsets[8],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers(){
				return (ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer>)super.get(super.type.generated_offsets[9]);
			}
			public void set_layers(ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> v){
				super.set(super.type.generated_offsets[9],v);
			}
			public ai.greycat.algebra.nn.PreProcessType preProcessType(){
				return (ai.greycat.algebra.nn.PreProcessType)super.get(super.type.generated_offsets[10]);
			}
			public void set_preProcessType(ai.greycat.algebra.nn.PreProcessType v){
				super.set(super.type.generated_offsets[10],v);
			}
			public java.lang.Object preProcessObject(){
				return super.get(super.type.generated_offsets[11]);
			}
			public void set_preProcessObject(java.lang.Object v){
				super.set(super.type.generated_offsets[11],v);
			}
			public ai.greycat.algebra.nn.PostProcessType postProcessType(){
				return (ai.greycat.algebra.nn.PostProcessType)super.get(super.type.generated_offsets[12]);
			}
			public void set_postProcessType(ai.greycat.algebra.nn.PostProcessType v){
				super.set(super.type.generated_offsets[12],v);
			}
			public java.lang.Object postProcessObject(){
				return super.get(super.type.generated_offsets[13]);
			}
			public void set_postProcessObject(java.lang.Object v){
				super.set(super.type.generated_offsets[13],v);
			}
			public ai.greycat.algebra.compute.ComputeOptimizer optimizer(){
				return (ai.greycat.algebra.compute.ComputeOptimizer)super.get(super.type.generated_offsets[14]);
			}
			public void set_optimizer(ai.greycat.algebra.compute.ComputeOptimizer v){
				super.set(super.type.generated_offsets[14],v);
			}
			public ai.greycat.algebra.compute.ComputeLayerLoss lossLayer(){
				return (ai.greycat.algebra.compute.ComputeLayerLoss)super.get(super.type.generated_offsets[15]);
			}
			public void set_lossLayer(ai.greycat.algebra.compute.ComputeLayerLoss v){
				super.set(super.type.generated_offsets[15],v);
			}
			public java.lang.String _lastLayer(){
				return (java.lang.String)super.get(super.type.generated_offsets[16]);
			}
			public void set__lastLayer(java.lang.String v){
				super.set(super.type.generated_offsets[16],v);
			}
			public java.lang.String _lastOutput(){
				return (java.lang.String)super.get(super.type.generated_offsets[17]);
			}
			public void set__lastOutput(java.lang.String v){
				super.set(super.type.generated_offsets[17],v);
			}
			public static RegressionNetwork create(ai.greycat.GreyCat greycat, java.lang.Long inputs, java.lang.Boolean inputs_gradients, java.lang.Long outputs, java.lang.Long fixed_batch_size, java.lang.Long inputs_sequences, java.lang.Long outputs_sequences, ai.greycat.std.core.TensorType tensor_type, java.lang.Long seed, java.lang.Boolean randomizeSeed, ai.greycat.std.core.Array<ai.greycat.algebra.compute.ComputeLayer> layers, ai.greycat.algebra.nn.PreProcessType preProcessType, java.lang.Object preProcessObject, ai.greycat.algebra.nn.PostProcessType postProcessType, java.lang.Object postProcessObject, ai.greycat.algebra.compute.ComputeOptimizer optimizer, ai.greycat.algebra.compute.ComputeLayerLoss lossLayer, java.lang.String _lastLayer, java.lang.String _lastOutput){
				return new RegressionNetwork(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[137], inputs, inputs_gradients, outputs, fixed_batch_size, inputs_sequences, outputs_sequences, tensor_type, seed, randomizeSeed, layers, preProcessType, preProcessObject, postProcessType, postProcessObject, optimizer, lossLayer, _lastLayer, _lastOutput);
			}
		}
		public static final class ClassificationMetrics extends GreyCat.Object {
			public static final java.lang.String name = "nn::ClassificationMetrics";
			private ClassificationMetrics(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.Array<java.lang.Double> precision(){
				return (ai.greycat.std.core.Array<java.lang.Double>)super.get(super.type.generated_offsets[0]);
			}
			public void set_precision(ai.greycat.std.core.Array<java.lang.Double> v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.Array<java.lang.Double> recall(){
				return (ai.greycat.std.core.Array<java.lang.Double>)super.get(super.type.generated_offsets[1]);
			}
			public void set_recall(ai.greycat.std.core.Array<java.lang.Double> v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Array<java.lang.Double> f1Score(){
				return (ai.greycat.std.core.Array<java.lang.Double>)super.get(super.type.generated_offsets[2]);
			}
			public void set_f1Score(ai.greycat.std.core.Array<java.lang.Double> v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ClassificationMetrics create(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<java.lang.Double> precision, ai.greycat.std.core.Array<java.lang.Double> recall, ai.greycat.std.core.Array<java.lang.Double> f1Score){
				return new ClassificationMetrics(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[138], precision, recall, f1Score);
			}
		}
		public static final class ComputeActivations extends GreyCat.Enum {
			public static final java.lang.String name = "nn::ComputeActivations";
			private ComputeActivations(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.nn.ComputeActivations relu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations leaky_relu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations sigmoid(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations hard_sigmoid(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations exp(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations soft_max(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[5]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations soft_plus(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[6]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations soft_sign(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[7]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations tanh(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[8]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations selu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[9]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations elu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[10]];
			}
			public static ai.greycat.algebra.nn.ComputeActivations celu(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139];
				return (ai.greycat.algebra.nn.ComputeActivations) t.enum_values[t.generated_offsets[11]];
			}
			public static ComputeActivations create(ai.greycat.GreyCat greycat){
				return new ComputeActivations(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[139]);
			}
		}
		public static final class PostProcessType extends GreyCat.Enum {
			public static final java.lang.String name = "nn::PostProcessType";
			private PostProcessType(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.nn.PostProcessType none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[140];
				return (ai.greycat.algebra.nn.PostProcessType) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.nn.PostProcessType min_max_scaling(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[140];
				return (ai.greycat.algebra.nn.PostProcessType) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.nn.PostProcessType standard_scaling(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[140];
				return (ai.greycat.algebra.nn.PostProcessType) t.enum_values[t.generated_offsets[2]];
			}
			public static PostProcessType create(ai.greycat.GreyCat greycat){
				return new PostProcessType(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[140]);
			}
		}
		public static final class BindingsResult extends GreyCat.Object {
			public static final java.lang.String name = "nn::BindingsResult";
			private BindingsResult(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.String previousLayerName(){
				return (java.lang.String)super.get(super.type.generated_offsets[0]);
			}
			public void set_previousLayerName(java.lang.String v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.String previousLayerOutput(){
				return (java.lang.String)super.get(super.type.generated_offsets[1]);
			}
			public void set_previousLayerOutput(java.lang.String v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.String expectedLayerName(){
				return (java.lang.String)super.get(super.type.generated_offsets[2]);
			}
			public void set_expectedLayerName(java.lang.String v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.String expectedLayerOutput(){
				return (java.lang.String)super.get(super.type.generated_offsets[3]);
			}
			public void set_expectedLayerOutput(java.lang.String v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.algebra.compute.ComputeLayer postLayer(){
				return (ai.greycat.algebra.compute.ComputeLayer)super.get(super.type.generated_offsets[4]);
			}
			public void set_postLayer(ai.greycat.algebra.compute.ComputeLayer v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static BindingsResult create(ai.greycat.GreyCat greycat, java.lang.String previousLayerName, java.lang.String previousLayerOutput, java.lang.String expectedLayerName, java.lang.String expectedLayerOutput, ai.greycat.algebra.compute.ComputeLayer postLayer){
				return new BindingsResult(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[141], previousLayerName, previousLayerOutput, expectedLayerName, expectedLayerOutput, postLayer);
			}
		}
		public static final class PreProcessType extends GreyCat.Enum {
			public static final java.lang.String name = "nn::PreProcessType";
			private PreProcessType(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.nn.PreProcessType none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[142];
				return (ai.greycat.algebra.nn.PreProcessType) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.nn.PreProcessType min_max_scaling(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[142];
				return (ai.greycat.algebra.nn.PreProcessType) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.nn.PreProcessType standard_scaling(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[142];
				return (ai.greycat.algebra.nn.PreProcessType) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.nn.PreProcessType pca_scaling(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[142];
				return (ai.greycat.algebra.nn.PreProcessType) t.enum_values[t.generated_offsets[3]];
			}
			public static PreProcessType create(ai.greycat.GreyCat greycat){
				return new PreProcessType(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[142]);
			}
		}
	}
	public static final class kmeans {
		public static final class KmeanResult extends GreyCat.Object {
			public static final java.lang.String name = "kmeans::KmeanResult";
			private KmeanResult(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double loss(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_loss(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.Array<java.lang.Double> roundsDistances(){
				return (ai.greycat.std.core.Array<java.lang.Double>)super.get(super.type.generated_offsets[1]);
			}
			public void set_roundsDistances(ai.greycat.std.core.Array<java.lang.Double> v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Tensor centroids(){
				return (ai.greycat.std.core.Tensor)super.get(super.type.generated_offsets[2]);
			}
			public void set_centroids(ai.greycat.std.core.Tensor v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.core.Tensor clusters_count(){
				return (ai.greycat.std.core.Tensor)super.get(super.type.generated_offsets[3]);
			}
			public void set_clusters_count(ai.greycat.std.core.Tensor v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.core.Tensor clusters_sum_distance(){
				return (ai.greycat.std.core.Tensor)super.get(super.type.generated_offsets[4]);
			}
			public void set_clusters_sum_distance(ai.greycat.std.core.Tensor v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.core.Tensor clusters_avg_distance(){
				return (ai.greycat.std.core.Tensor)super.get(super.type.generated_offsets[5]);
			}
			public void set_clusters_avg_distance(ai.greycat.std.core.Tensor v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.Tensor assignement(){
				return (ai.greycat.std.core.Tensor)super.get(super.type.generated_offsets[6]);
			}
			public void set_assignement(ai.greycat.std.core.Tensor v){
				super.set(super.type.generated_offsets[6],v);
			}
			public ai.greycat.std.core.Tensor distances(){
				return (ai.greycat.std.core.Tensor)super.get(super.type.generated_offsets[7]);
			}
			public void set_distances(ai.greycat.std.core.Tensor v){
				super.set(super.type.generated_offsets[7],v);
			}
			public ai.greycat.std.core.Tensor clusterInterDistances(){
				return (ai.greycat.std.core.Tensor)super.get(super.type.generated_offsets[8]);
			}
			public void set_clusterInterDistances(ai.greycat.std.core.Tensor v){
				super.set(super.type.generated_offsets[8],v);
			}
			public static KmeanResult create(ai.greycat.GreyCat greycat, java.lang.Double loss, ai.greycat.std.core.Array<java.lang.Double> roundsDistances, ai.greycat.std.core.Tensor centroids, ai.greycat.std.core.Tensor clusters_count, ai.greycat.std.core.Tensor clusters_sum_distance, ai.greycat.std.core.Tensor clusters_avg_distance, ai.greycat.std.core.Tensor assignement, ai.greycat.std.core.Tensor distances, ai.greycat.std.core.Tensor clusterInterDistances){
				return new KmeanResult(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[143], loss, roundsDistances, centroids, clusters_count, clusters_sum_distance, clusters_avg_distance, assignement, distances, clusterInterDistances);
			}
		}
		public static final class KmeanMetaResult extends GreyCat.Object {
			public static final java.lang.String name = "kmeans::KmeanMetaResult";
			private KmeanMetaResult(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.Array<java.lang.Double> runDistances(){
				return (ai.greycat.std.core.Array<java.lang.Double>)super.get(super.type.generated_offsets[0]);
			}
			public void set_runDistances(ai.greycat.std.core.Array<java.lang.Double> v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.kmeans.KmeanResult bestResult(){
				return (ai.greycat.algebra.kmeans.KmeanResult)super.get(super.type.generated_offsets[1]);
			}
			public void set_bestResult(ai.greycat.algebra.kmeans.KmeanResult v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static KmeanMetaResult create(ai.greycat.GreyCat greycat, ai.greycat.std.core.Array<java.lang.Double> runDistances, ai.greycat.algebra.kmeans.KmeanResult bestResult){
				return new KmeanMetaResult(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[144], runDistances, bestResult);
			}
		}
		public static final class Kmeans extends GreyCat.Object {
			public static final java.lang.String name = "kmeans::Kmeans";
			private Kmeans(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static java.lang.String var_input(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[0];
			}
			public static java.lang.String var_assignement(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[1];
			}
			public static java.lang.String var_min_distance(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[2];
			}
			public static java.lang.String varo_centroids(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[3];
			}
			public static java.lang.String var_distance(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[4];
			}
			public static java.lang.String var_sum_centroids(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[5];
			}
			public static java.lang.String var_sum_min_distance(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[6];
			}
			public static java.lang.String var_count_centroids(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[7];
			}
			public static java.lang.String var_centroid_distances(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[8];
			}
			public static java.lang.String var_sum_cluster_distances(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[9];
			}
			public static java.lang.String var_avg_cluster_distances(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[10];
			}
			public static java.lang.String var_count_cluster_distances(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[11];
			}
			public static java.lang.String layer_placeholders(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[12];
			}
			public static java.lang.String layer_forward(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[13];
			}
			public static java.lang.String layer_backward(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[14];
			}
			public static java.lang.String layer_init_round(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[15];
			}
			public static java.lang.String layer_end_round(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[16];
			}
			public static java.lang.String layer_stats(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[17];
			}
			public static java.lang.String seq_init_round(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[18];
			}
			public static java.lang.String seq_forward(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[19];
			}
			public static java.lang.String seq_backward(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[20];
			}
			public static java.lang.String seq_end_round(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[21];
			}
			public static java.lang.String seq_stats(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.String) t.static_values[22];
			}
			public static java.lang.Long default_meta_rounds(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.Long) t.static_values[23];
			}
			public static java.lang.Long default_rounds(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145];
				return (java.lang.Long) t.static_values[24];
			}
			public static Kmeans create(ai.greycat.GreyCat greycat){
				return new Kmeans(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[145]);
			}
		}
	}
	public static final class patterns {
		public static final class DTWPatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "patterns::DTWPatternDetector";
			private DTWPatternDetector(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static DTWPatternDetector create(ai.greycat.GreyCat greycat){
				return new DTWPatternDetector(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[146]);
			}
		}
		public static final class ScoreDetailsSingleton extends GreyCat.Object {
			public static final java.lang.String name = "patterns::ScoreDetailsSingleton";
			private ScoreDetailsSingleton(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long best_pattern(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_best_pattern(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.duration timespan(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[1]);
			}
			public void set_timespan(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.time timestamp(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[2]);
			}
			public void set_timestamp(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ScoreDetailsSingleton create(ai.greycat.GreyCat greycat, java.lang.Long best_pattern, ai.greycat.std.core.duration timespan, ai.greycat.std.core.time timestamp){
				return new ScoreDetailsSingleton(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[147], best_pattern, timespan, timestamp);
			}
		}
		public static final class PatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "patterns::PatternDetector";
			private PatternDetector(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static PatternDetector create(ai.greycat.GreyCat greycat){
				return new PatternDetector(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[148]);
			}
		}
		public static final class PatternDetectionEngine extends GreyCat.Object {
			public static final java.lang.String name = "patterns::PatternDetectionEngine";
			private PatternDetectionEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime timeseries(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_timeseries(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.patterns.PatternDetectionEngineState state(){
				return (ai.greycat.algebra.patterns.PatternDetectionEngineState)super.get(super.type.generated_offsets[1]);
			}
			public void set_state(ai.greycat.algebra.patterns.PatternDetectionEngineState v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy(){
				return (ai.greycat.algebra.patterns.PatternNullStrategy)super.get(super.type.generated_offsets[2]);
			}
			public void set_nullStrategy(ai.greycat.algebra.patterns.PatternNullStrategy v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double nullReplaceConstant(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_nullReplaceConstant(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy(){
				return (ai.greycat.algebra.patterns.SamplingPolicy)super.get(super.type.generated_offsets[4]);
			}
			public void set_samplingPolicy(ai.greycat.algebra.patterns.SamplingPolicy v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static PatternDetectionEngine create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime timeseries, ai.greycat.algebra.patterns.PatternDetectionEngineState state, ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy, java.lang.Double nullReplaceConstant, ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy){
				return new PatternDetectionEngine(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[149], timeseries, state, nullStrategy, nullReplaceConstant, samplingPolicy);
			}
		}
		public static final class PatternDetectionSensitivity extends GreyCat.Object {
			public static final java.lang.String name = "patterns::PatternDetectionSensitivity";
			private PatternDetectionSensitivity(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double threshold(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_threshold(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double overlap(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_overlap(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static PatternDetectionSensitivity create(ai.greycat.GreyCat greycat, java.lang.Double threshold, java.lang.Double overlap){
				return new PatternDetectionSensitivity(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[150], threshold, overlap);
			}
		}
		public static final class SaxPatternDetectionEngine extends GreyCat.Object {
			public static final java.lang.String name = "patterns::SaxPatternDetectionEngine";
			private SaxPatternDetectionEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime timeseries(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_timeseries(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.patterns.PatternDetectionEngineState state(){
				return (ai.greycat.algebra.patterns.PatternDetectionEngineState)super.get(super.type.generated_offsets[1]);
			}
			public void set_state(ai.greycat.algebra.patterns.PatternDetectionEngineState v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy(){
				return (ai.greycat.algebra.patterns.PatternNullStrategy)super.get(super.type.generated_offsets[2]);
			}
			public void set_nullStrategy(ai.greycat.algebra.patterns.PatternNullStrategy v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double nullReplaceConstant(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_nullReplaceConstant(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy(){
				return (ai.greycat.algebra.patterns.SamplingPolicy)super.get(super.type.generated_offsets[4]);
			}
			public void set_samplingPolicy(ai.greycat.algebra.patterns.SamplingPolicy v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Long alphabet_size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[5]);
			}
			public void set_alphabet_size(java.lang.Long v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.Array<java.lang.Double> alphabet_boundaries(){
				return (ai.greycat.std.core.Array<java.lang.Double>)super.get(super.type.generated_offsets[6]);
			}
			public void set_alphabet_boundaries(ai.greycat.std.core.Array<java.lang.Double> v){
				super.set(super.type.generated_offsets[6],v);
			}
			public ai.greycat.std.core.nodeIndex lookup_table(){
				return (ai.greycat.std.core.nodeIndex)super.get(super.type.generated_offsets[7]);
			}
			public void set_lookup_table(ai.greycat.std.core.nodeIndex v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Double max_distance(){
				return (java.lang.Double)super.get(super.type.generated_offsets[8]);
			}
			public void set_max_distance(java.lang.Double v){
				super.set(super.type.generated_offsets[8],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> pattern_fingerprints(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[9]);
			}
			public void set_pattern_fingerprints(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[9],v);
			}
			public java.lang.Long fingerprint_length(){
				return (java.lang.Long)super.get(super.type.generated_offsets[10]);
			}
			public void set_fingerprint_length(java.lang.Long v){
				super.set(super.type.generated_offsets[10],v);
			}
			public static java.lang.String alphabet(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[151];
				return (java.lang.String) t.static_values[0];
			}
			public static SaxPatternDetectionEngine create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime timeseries, ai.greycat.algebra.patterns.PatternDetectionEngineState state, ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy, java.lang.Double nullReplaceConstant, ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy, java.lang.Long alphabet_size, ai.greycat.std.core.Array<java.lang.Double> alphabet_boundaries, ai.greycat.std.core.nodeIndex lookup_table, java.lang.Double max_distance, ai.greycat.std.core.Array<java.lang.String> pattern_fingerprints, java.lang.Long fingerprint_length){
				return new SaxPatternDetectionEngine(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[151], timeseries, state, nullStrategy, nullReplaceConstant, samplingPolicy, alphabet_size, alphabet_boundaries, lookup_table, max_distance, pattern_fingerprints, fingerprint_length);
			}
		}
		public static final class SamplingPolicy extends GreyCat.Enum {
			public static final java.lang.String name = "patterns::SamplingPolicy";
			private SamplingPolicy(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.patterns.SamplingPolicy as_is(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[152];
				return (ai.greycat.algebra.patterns.SamplingPolicy) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.patterns.SamplingPolicy average_frequency(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[152];
				return (ai.greycat.algebra.patterns.SamplingPolicy) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.patterns.SamplingPolicy highest_frequency(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[152];
				return (ai.greycat.algebra.patterns.SamplingPolicy) t.enum_values[t.generated_offsets[2]];
			}
			public static SamplingPolicy create(ai.greycat.GreyCat greycat){
				return new SamplingPolicy(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[152]);
			}
		}
		public static final class DTWPatternDetectionEngine extends GreyCat.Object {
			public static final java.lang.String name = "patterns::DTWPatternDetectionEngine";
			private DTWPatternDetectionEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime timeseries(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_timeseries(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.patterns.PatternDetectionEngineState state(){
				return (ai.greycat.algebra.patterns.PatternDetectionEngineState)super.get(super.type.generated_offsets[1]);
			}
			public void set_state(ai.greycat.algebra.patterns.PatternDetectionEngineState v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy(){
				return (ai.greycat.algebra.patterns.PatternNullStrategy)super.get(super.type.generated_offsets[2]);
			}
			public void set_nullStrategy(ai.greycat.algebra.patterns.PatternNullStrategy v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double nullReplaceConstant(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_nullReplaceConstant(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy(){
				return (ai.greycat.algebra.patterns.SamplingPolicy)super.get(super.type.generated_offsets[4]);
			}
			public void set_samplingPolicy(ai.greycat.algebra.patterns.SamplingPolicy v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Double std(){
				return (java.lang.Double)super.get(super.type.generated_offsets[5]);
			}
			public void set_std(java.lang.Double v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.algebra.patterns.MatchingNormalisation matchingNormalisation(){
				return (ai.greycat.algebra.patterns.MatchingNormalisation)super.get(super.type.generated_offsets[6]);
			}
			public void set_matchingNormalisation(ai.greycat.algebra.patterns.MatchingNormalisation v){
				super.set(super.type.generated_offsets[6],v);
			}
			public static DTWPatternDetectionEngine create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime timeseries, ai.greycat.algebra.patterns.PatternDetectionEngineState state, ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy, java.lang.Double nullReplaceConstant, ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy, java.lang.Double std, ai.greycat.algebra.patterns.MatchingNormalisation matchingNormalisation){
				return new DTWPatternDetectionEngine(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[153], timeseries, state, nullStrategy, nullReplaceConstant, samplingPolicy, std, matchingNormalisation);
			}
		}
		public static final class PatternDetectionEngineState extends GreyCat.Object {
			public static final java.lang.String name = "patterns::PatternDetectionEngineState";
			private PatternDetectionEngineState(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Boolean hasScores(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[0]);
			}
			public void set_hasScores(java.lang.Boolean v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Boolean hasDetections(){
				return (java.lang.Boolean)super.get(super.type.generated_offsets[1]);
			}
			public void set_hasDetections(java.lang.Boolean v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.std.util.TimeWindow> patterns(){
				return (ai.greycat.std.core.Array<ai.greycat.std.util.TimeWindow>)super.get(super.type.generated_offsets[2]);
			}
			public void set_patterns(ai.greycat.std.core.Array<ai.greycat.std.util.TimeWindow> v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.core.nodeList scores(){
				return (ai.greycat.std.core.nodeList)super.get(super.type.generated_offsets[3]);
			}
			public void set_scores(ai.greycat.std.core.nodeList v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.core.nodeTime detections(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[4]);
			}
			public void set_detections(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static PatternDetectionEngineState create(ai.greycat.GreyCat greycat, java.lang.Boolean hasScores, java.lang.Boolean hasDetections, ai.greycat.std.core.Array<ai.greycat.std.util.TimeWindow> patterns, ai.greycat.std.core.nodeList scores, ai.greycat.std.core.nodeTime detections){
				return new PatternDetectionEngineState(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[154], hasScores, hasDetections, patterns, scores, detections);
			}
		}
		public static final class RandomPatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "patterns::RandomPatternDetector";
			private RandomPatternDetector(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static RandomPatternDetector create(ai.greycat.GreyCat greycat){
				return new RandomPatternDetector(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[155]);
			}
		}
		public static final class FFTPatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "patterns::FFTPatternDetector";
			private FFTPatternDetector(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static FFTPatternDetector create(ai.greycat.GreyCat greycat){
				return new FFTPatternDetector(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[156]);
			}
		}
		public static final class ScoreDetails extends GreyCat.Object {
			public static final java.lang.String name = "patterns::ScoreDetails";
			private ScoreDetails(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long best_pattern(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_best_pattern(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.duration timespan(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[1]);
			}
			public void set_timespan(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ScoreDetails create(ai.greycat.GreyCat greycat, java.lang.Long best_pattern, ai.greycat.std.core.duration timespan){
				return new ScoreDetails(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[157], best_pattern, timespan);
			}
		}
		public static final class Detection extends GreyCat.Object {
			public static final java.lang.String name = "patterns::Detection";
			private Detection(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double score(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_score(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long best_pattern(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_best_pattern(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.duration timespan(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[2]);
			}
			public void set_timespan(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static Detection create(ai.greycat.GreyCat greycat, java.lang.Double score, java.lang.Long best_pattern, ai.greycat.std.core.duration timespan){
				return new Detection(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[158], score, best_pattern, timespan);
			}
		}
		public static final class EuclideanPatternDetectionEngine extends GreyCat.Object {
			public static final java.lang.String name = "patterns::EuclideanPatternDetectionEngine";
			private EuclideanPatternDetectionEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime timeseries(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_timeseries(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.patterns.PatternDetectionEngineState state(){
				return (ai.greycat.algebra.patterns.PatternDetectionEngineState)super.get(super.type.generated_offsets[1]);
			}
			public void set_state(ai.greycat.algebra.patterns.PatternDetectionEngineState v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy(){
				return (ai.greycat.algebra.patterns.PatternNullStrategy)super.get(super.type.generated_offsets[2]);
			}
			public void set_nullStrategy(ai.greycat.algebra.patterns.PatternNullStrategy v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double nullReplaceConstant(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_nullReplaceConstant(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy(){
				return (ai.greycat.algebra.patterns.SamplingPolicy)super.get(super.type.generated_offsets[4]);
			}
			public void set_samplingPolicy(ai.greycat.algebra.patterns.SamplingPolicy v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.std.core.Tensor> pattern_tensors(){
				return (ai.greycat.std.core.Array<ai.greycat.std.core.Tensor>)super.get(super.type.generated_offsets[5]);
			}
			public void set_pattern_tensors(ai.greycat.std.core.Array<ai.greycat.std.core.Tensor> v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.Array<ai.greycat.std.core.Tensor> window_tensors(){
				return (ai.greycat.std.core.Array<ai.greycat.std.core.Tensor>)super.get(super.type.generated_offsets[6]);
			}
			public void set_window_tensors(ai.greycat.std.core.Array<ai.greycat.std.core.Tensor> v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Double std(){
				return (java.lang.Double)super.get(super.type.generated_offsets[7]);
			}
			public void set_std(java.lang.Double v){
				super.set(super.type.generated_offsets[7],v);
			}
			public ai.greycat.algebra.patterns.MatchingNormalisation matchingNormalisation(){
				return (ai.greycat.algebra.patterns.MatchingNormalisation)super.get(super.type.generated_offsets[8]);
			}
			public void set_matchingNormalisation(ai.greycat.algebra.patterns.MatchingNormalisation v){
				super.set(super.type.generated_offsets[8],v);
			}
			public static EuclideanPatternDetectionEngine create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime timeseries, ai.greycat.algebra.patterns.PatternDetectionEngineState state, ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy, java.lang.Double nullReplaceConstant, ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy, ai.greycat.std.core.Array<ai.greycat.std.core.Tensor> pattern_tensors, ai.greycat.std.core.Array<ai.greycat.std.core.Tensor> window_tensors, java.lang.Double std, ai.greycat.algebra.patterns.MatchingNormalisation matchingNormalisation){
				return new EuclideanPatternDetectionEngine(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[159], timeseries, state, nullStrategy, nullReplaceConstant, samplingPolicy, pattern_tensors, window_tensors, std, matchingNormalisation);
			}
		}
		public static final class RandomPatternDetectionEngine extends GreyCat.Object {
			public static final java.lang.String name = "patterns::RandomPatternDetectionEngine";
			private RandomPatternDetectionEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime timeseries(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_timeseries(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.algebra.patterns.PatternDetectionEngineState state(){
				return (ai.greycat.algebra.patterns.PatternDetectionEngineState)super.get(super.type.generated_offsets[1]);
			}
			public void set_state(ai.greycat.algebra.patterns.PatternDetectionEngineState v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy(){
				return (ai.greycat.algebra.patterns.PatternNullStrategy)super.get(super.type.generated_offsets[2]);
			}
			public void set_nullStrategy(ai.greycat.algebra.patterns.PatternNullStrategy v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double nullReplaceConstant(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_nullReplaceConstant(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy(){
				return (ai.greycat.algebra.patterns.SamplingPolicy)super.get(super.type.generated_offsets[4]);
			}
			public void set_samplingPolicy(ai.greycat.algebra.patterns.SamplingPolicy v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.util.Random rng(){
				return (ai.greycat.std.util.Random)super.get(super.type.generated_offsets[5]);
			}
			public void set_rng(ai.greycat.std.util.Random v){
				super.set(super.type.generated_offsets[5],v);
			}
			public static RandomPatternDetectionEngine create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime timeseries, ai.greycat.algebra.patterns.PatternDetectionEngineState state, ai.greycat.algebra.patterns.PatternNullStrategy nullStrategy, java.lang.Double nullReplaceConstant, ai.greycat.algebra.patterns.SamplingPolicy samplingPolicy, ai.greycat.std.util.Random rng){
				return new RandomPatternDetectionEngine(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[160], timeseries, state, nullStrategy, nullReplaceConstant, samplingPolicy, rng);
			}
		}
		public static final class PatternNullStrategy extends GreyCat.Enum {
			public static final java.lang.String name = "patterns::PatternNullStrategy";
			private PatternNullStrategy(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.patterns.PatternNullStrategy replace(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[161];
				return (ai.greycat.algebra.patterns.PatternNullStrategy) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.patterns.PatternNullStrategy interpolate(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[161];
				return (ai.greycat.algebra.patterns.PatternNullStrategy) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.patterns.PatternNullStrategy previous(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[161];
				return (ai.greycat.algebra.patterns.PatternNullStrategy) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.patterns.PatternNullStrategy next(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[161];
				return (ai.greycat.algebra.patterns.PatternNullStrategy) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.algebra.patterns.PatternNullStrategy none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[161];
				return (ai.greycat.algebra.patterns.PatternNullStrategy) t.enum_values[t.generated_offsets[4]];
			}
			public static PatternNullStrategy create(ai.greycat.GreyCat greycat){
				return new PatternNullStrategy(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[161]);
			}
		}
		public static final class PatternDetectors extends GreyCat.Enum {
			public static final java.lang.String name = "patterns::PatternDetectors";
			private PatternDetectors(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.patterns.PatternDetectors none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[162];
				return (ai.greycat.algebra.patterns.PatternDetectors) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.patterns.PatternDetectors euclidean(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[162];
				return (ai.greycat.algebra.patterns.PatternDetectors) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.patterns.PatternDetectors fft(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[162];
				return (ai.greycat.algebra.patterns.PatternDetectors) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.patterns.PatternDetectors dtw(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[162];
				return (ai.greycat.algebra.patterns.PatternDetectors) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.algebra.patterns.PatternDetectors random(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[162];
				return (ai.greycat.algebra.patterns.PatternDetectors) t.enum_values[t.generated_offsets[4]];
			}
			public static ai.greycat.algebra.patterns.PatternDetectors sax(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[162];
				return (ai.greycat.algebra.patterns.PatternDetectors) t.enum_values[t.generated_offsets[5]];
			}
			public static PatternDetectors create(ai.greycat.GreyCat greycat){
				return new PatternDetectors(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[162]);
			}
		}
		public static final class MatchingNormalisation extends GreyCat.Enum {
			public static final java.lang.String name = "patterns::MatchingNormalisation";
			private MatchingNormalisation(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.algebra.patterns.MatchingNormalisation as_is(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[163];
				return (ai.greycat.algebra.patterns.MatchingNormalisation) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.algebra.patterns.MatchingNormalisation shift(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[163];
				return (ai.greycat.algebra.patterns.MatchingNormalisation) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.algebra.patterns.MatchingNormalisation scaling(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[163];
				return (ai.greycat.algebra.patterns.MatchingNormalisation) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.algebra.patterns.MatchingNormalisation shift_and_scaling(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[163];
				return (ai.greycat.algebra.patterns.MatchingNormalisation) t.enum_values[t.generated_offsets[3]];
			}
			public static MatchingNormalisation create(ai.greycat.GreyCat greycat){
				return new MatchingNormalisation(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[163]);
			}
		}
		public static final class DistanceMetrics extends GreyCat.Object {
			public static final java.lang.String name = "patterns::DistanceMetrics";
			private DistanceMetrics(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static DistanceMetrics create(ai.greycat.GreyCat greycat){
				return new DistanceMetrics(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[164]);
			}
		}
		public static final class EuclideanPatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "patterns::EuclideanPatternDetector";
			private EuclideanPatternDetector(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static EuclideanPatternDetector create(ai.greycat.GreyCat greycat){
				return new EuclideanPatternDetector(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[165]);
			}
		}
		public static final class FFTResult extends GreyCat.Object {
			public static final java.lang.String name = "patterns::FFTResult";
			private FFTResult(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double distance(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_distance(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long best_pattern(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_best_pattern(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.duration best_timespan(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[2]);
			}
			public void set_best_timespan(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static FFTResult create(ai.greycat.GreyCat greycat, java.lang.Double distance, java.lang.Long best_pattern, ai.greycat.std.core.duration best_timespan){
				return new FFTResult(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[166], distance, best_pattern, best_timespan);
			}
		}
		public static final class OverlappingDetection extends GreyCat.Object {
			public static final java.lang.String name = "patterns::OverlappingDetection";
			private OverlappingDetection(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double score(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_score(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long best_pattern(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_best_pattern(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.duration timespan(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[2]);
			}
			public void set_timespan(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.core.duration overlap(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[3]);
			}
			public void set_overlap(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static OverlappingDetection create(ai.greycat.GreyCat greycat, java.lang.Double score, java.lang.Long best_pattern, ai.greycat.std.core.duration timespan, ai.greycat.std.core.duration overlap){
				return new OverlappingDetection(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[167], score, best_pattern, timespan, overlap);
			}
		}
		public static final class SaxPatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "patterns::SaxPatternDetector";
			private SaxPatternDetector(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long alphabet_size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_alphabet_size(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Long fingerprint_length(){
				return (java.lang.Long)super.get(super.type.generated_offsets[1]);
			}
			public void set_fingerprint_length(java.lang.Long v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static SaxPatternDetector create(ai.greycat.GreyCat greycat, java.lang.Long alphabet_size, java.lang.Long fingerprint_length){
				return new SaxPatternDetector(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[168], alphabet_size, fingerprint_length);
			}
		}
	}
	public static final class ml {
		public static final class TimeSeriesDecomposition extends GreyCat.Object {
			public static final java.lang.String name = "ml::TimeSeriesDecomposition";
			private TimeSeriesDecomposition(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static TimeSeriesDecomposition create(ai.greycat.GreyCat greycat){
				return new TimeSeriesDecomposition(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[169]);
			}
		}
		public static final class PCA extends ai.greycat.algebra_n.ml.PCA {
			public static final java.lang.String name = "ml::PCA";
			private PCA(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static PCA create(ai.greycat.GreyCat greycat){
				return new PCA(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[170]);
			}
		}
		public static final class GaussianND extends ai.greycat.algebra_n.ml.GaussianND {
			public static final java.lang.String name = "ml::GaussianND";
			private GaussianND(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static GaussianND create(ai.greycat.GreyCat greycat){
				return new GaussianND(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[171]);
			}
		}
		public static final class HeatMapProfile extends GreyCat.Object {
			public static final java.lang.String name = "ml::HeatMapProfile";
			private HeatMapProfile(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.Table<java.lang.Long> counts(){
				return (ai.greycat.std.core.Table<java.lang.Long>)super.get(super.type.generated_offsets[0]);
			}
			public void set_counts(ai.greycat.std.core.Table<java.lang.Long> v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> x_labels(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[1]);
			}
			public void set_x_labels(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> y_labels(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[2]);
			}
			public void set_y_labels(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Long counts_max(){
				return (java.lang.Long)super.get(super.type.generated_offsets[3]);
			}
			public void set_counts_max(java.lang.Long v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long counts_sum(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_counts_sum(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static HeatMapProfile create(ai.greycat.GreyCat greycat, ai.greycat.std.core.Table<java.lang.Long> counts, ai.greycat.std.core.Array<java.lang.String> x_labels, ai.greycat.std.core.Array<java.lang.String> y_labels, java.lang.Long counts_max, java.lang.Long counts_sum){
				return new HeatMapProfile(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[172], counts, x_labels, y_labels, counts_max, counts_sum);
			}
		}
		public static final class Polynomial extends ai.greycat.algebra_n.ml.Polynomial {
			public static final java.lang.String name = "ml::Polynomial";
			private Polynomial(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type);
			}
			public static Polynomial create(ai.greycat.GreyCat greycat){
				return new Polynomial(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[173]);
			}
		}
		public static final class Solver extends GreyCat.Object {
			public static final java.lang.String name = "ml::Solver";
			private Solver(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static Solver create(ai.greycat.GreyCat greycat){
				return new Solver(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[174]);
			}
		}
	}
	public static final class transforms {
		public static final class FFTModel extends GreyCat.Object {
			public static final java.lang.String name = "transforms::FFTModel";
			private FFTModel(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime nt(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_nt(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std.core.duration sampling_step(){
				return (ai.greycat.std.core.duration)super.get(super.type.generated_offsets[1]);
			}
			public void set_sampling_step(ai.greycat.std.core.duration v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std.core.Tensor time_complex(){
				return (ai.greycat.std.core.Tensor)super.get(super.type.generated_offsets[2]);
			}
			public void set_time_complex(ai.greycat.std.core.Tensor v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std.core.Tensor frequency_complex(){
				return (ai.greycat.std.core.Tensor)super.get(super.type.generated_offsets[3]);
			}
			public void set_frequency_complex(ai.greycat.std.core.Tensor v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.core.Table frequency_table(){
				return (ai.greycat.std.core.Table)super.get(super.type.generated_offsets[4]);
			}
			public void set_frequency_table(ai.greycat.std.core.Table v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.core.time start_time(){
				return (ai.greycat.std.core.time)super.get(super.type.generated_offsets[5]);
			}
			public void set_start_time(ai.greycat.std.core.time v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Long best_size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[6]);
			}
			public void set_best_size(java.lang.Long v){
				super.set(super.type.generated_offsets[6],v);
			}
			public static FFTModel create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime nt, ai.greycat.std.core.duration sampling_step, ai.greycat.std.core.Tensor time_complex, ai.greycat.std.core.Tensor frequency_complex, ai.greycat.std.core.Table frequency_table, ai.greycat.std.core.time start_time, java.lang.Long best_size){
				return new FFTModel(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[175], nt, sampling_step, time_complex, frequency_complex, frequency_table, start_time, best_size);
			}
		}
	}
	public static final class powerflow {
		public static final class PowerBusResult extends GreyCat.Object {
			public static final java.lang.String name = "powerflow::PowerBusResult";
			private PowerBusResult(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double abs(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_abs(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double angle_radians(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_angle_radians(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double voltage(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_voltage(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double voltage_img(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_voltage_img(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Double current(){
				return (java.lang.Double)super.get(super.type.generated_offsets[4]);
			}
			public void set_current(java.lang.Double v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Double current_img(){
				return (java.lang.Double)super.get(super.type.generated_offsets[5]);
			}
			public void set_current_img(java.lang.Double v){
				super.set(super.type.generated_offsets[5],v);
			}
			public static PowerBusResult create(ai.greycat.GreyCat greycat, java.lang.Double abs, java.lang.Double angle_radians, java.lang.Double voltage, java.lang.Double voltage_img, java.lang.Double current, java.lang.Double current_img){
				return new PowerBusResult(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[176], abs, angle_radians, voltage, voltage_img, current, current_img);
			}
		}
		public static final class PowerLineResult extends GreyCat.Object {
			public static final java.lang.String name = "powerflow::PowerLineResult";
			private PowerLineResult(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Double p_from_mw(){
				return (java.lang.Double)super.get(super.type.generated_offsets[0]);
			}
			public void set_p_from_mw(java.lang.Double v){
				super.set(super.type.generated_offsets[0],v);
			}
			public java.lang.Double q_from_mvar(){
				return (java.lang.Double)super.get(super.type.generated_offsets[1]);
			}
			public void set_q_from_mvar(java.lang.Double v){
				super.set(super.type.generated_offsets[1],v);
			}
			public java.lang.Double p_to_mw(){
				return (java.lang.Double)super.get(super.type.generated_offsets[2]);
			}
			public void set_p_to_mw(java.lang.Double v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double q_to_mvar(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_q_to_mvar(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Double pl_mw(){
				return (java.lang.Double)super.get(super.type.generated_offsets[4]);
			}
			public void set_pl_mw(java.lang.Double v){
				super.set(super.type.generated_offsets[4],v);
			}
			public java.lang.Double ql_mvar(){
				return (java.lang.Double)super.get(super.type.generated_offsets[5]);
			}
			public void set_ql_mvar(java.lang.Double v){
				super.set(super.type.generated_offsets[5],v);
			}
			public java.lang.Double i_from_ka(){
				return (java.lang.Double)super.get(super.type.generated_offsets[6]);
			}
			public void set_i_from_ka(java.lang.Double v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Double i_to_ka(){
				return (java.lang.Double)super.get(super.type.generated_offsets[7]);
			}
			public void set_i_to_ka(java.lang.Double v){
				super.set(super.type.generated_offsets[7],v);
			}
			public java.lang.Double i_ka(){
				return (java.lang.Double)super.get(super.type.generated_offsets[8]);
			}
			public void set_i_ka(java.lang.Double v){
				super.set(super.type.generated_offsets[8],v);
			}
			public java.lang.Double vm_from_pu(){
				return (java.lang.Double)super.get(super.type.generated_offsets[9]);
			}
			public void set_vm_from_pu(java.lang.Double v){
				super.set(super.type.generated_offsets[9],v);
			}
			public java.lang.Double vm_to_pu(){
				return (java.lang.Double)super.get(super.type.generated_offsets[10]);
			}
			public void set_vm_to_pu(java.lang.Double v){
				super.set(super.type.generated_offsets[10],v);
			}
			public java.lang.Double va_from_radians(){
				return (java.lang.Double)super.get(super.type.generated_offsets[11]);
			}
			public void set_va_from_radians(java.lang.Double v){
				super.set(super.type.generated_offsets[11],v);
			}
			public java.lang.Double va_to_radians(){
				return (java.lang.Double)super.get(super.type.generated_offsets[12]);
			}
			public void set_va_to_radians(java.lang.Double v){
				super.set(super.type.generated_offsets[12],v);
			}
			public java.lang.Double loading_percent(){
				return (java.lang.Double)super.get(super.type.generated_offsets[13]);
			}
			public void set_loading_percent(java.lang.Double v){
				super.set(super.type.generated_offsets[13],v);
			}
			public static PowerLineResult create(ai.greycat.GreyCat greycat, java.lang.Double p_from_mw, java.lang.Double q_from_mvar, java.lang.Double p_to_mw, java.lang.Double q_to_mvar, java.lang.Double pl_mw, java.lang.Double ql_mvar, java.lang.Double i_from_ka, java.lang.Double i_to_ka, java.lang.Double i_ka, java.lang.Double vm_from_pu, java.lang.Double vm_to_pu, java.lang.Double va_from_radians, java.lang.Double va_to_radians, java.lang.Double loading_percent){
				return new PowerLineResult(greycat.libs_by_name.get(ai.greycat.algebra.name).mapped[177], p_from_mw, q_from_mvar, p_to_mw, q_to_mvar, pl_mw, ql_mvar, i_from_ka, i_to_ka, i_ka, vm_from_pu, vm_to_pu, va_from_radians, va_to_radians, loading_percent);
			}
		}
	}
	@Override
	public void configure(java.util.Map<String, ai.greycat.GreyCat.Loader> loaders, java.util.Map<String, ai.greycat.GreyCat.Factory> factories) {
		factories.put(compute.ComputeClassificationLoss.name, compute.ComputeClassificationLoss::new);
		factories.put(compute.ComputeLayerActivation.name, compute.ComputeLayerActivation::new);
		factories.put(compute.ComputeOperationClip.name, compute.ComputeOperationClip::new);
		factories.put(compute.ComputeInitializerXavier.name, compute.ComputeInitializerXavier::new);
		factories.put(compute.ComputeOperationAtanh.name, compute.ComputeOperationAtanh::new);
		factories.put(compute.ComputeInitializerRelu.name, compute.ComputeInitializerRelu::new);
		factories.put(compute.ComputeOperationSoftSign.name, compute.ComputeOperationSoftSign::new);
		factories.put(compute.ComputeOperationSinh.name, compute.ComputeOperationSinh::new);
		factories.put(compute.ComputeState.name, compute.ComputeState::new);
		loaders.put(compute.ComputeState.name, ai.greycat.algebra_n.compute.ComputeState::load);
		factories.put(compute.ComputeActivationSelu.name, compute.ComputeActivationSelu::new);
		factories.put(compute.ComputeLayerClassification.name, compute.ComputeLayerClassification::new);
		factories.put(compute.ComputeInitializerNormalOut.name, compute.ComputeInitializerNormalOut::new);
		factories.put(compute.ComputeActivationLeakyRelu.name, compute.ComputeActivationLeakyRelu::new);
		factories.put(compute.ComputeOperationFill.name, compute.ComputeOperationFill::new);
		factories.put(compute.ComputeOptimizerNadam.name, compute.ComputeOptimizerNadam::new);
		factories.put(compute.ComputeActivationHardSigmoid.name, compute.ComputeActivationHardSigmoid::new);
		factories.put(compute.ComputeLayerStandardScaler.name, compute.ComputeLayerStandardScaler::new);
		factories.put(compute.ComputeOperationMatMul.name, compute.ComputeOperationMatMul::new);
		factories.put(compute.ComputeLayerSeq.name, compute.ComputeLayerSeq::new);
		factories.put(compute.ComputeOperationSoftplus.name, compute.ComputeOperationSoftplus::new);
		factories.put(compute.ComputeOperationElu.name, compute.ComputeOperationElu::new);
		factories.put(compute.ComputeOperationLog.name, compute.ComputeOperationLog::new);
		factories.put(compute.ComputeOperationSigmoid.name, compute.ComputeOperationSigmoid::new);
		factories.put(compute.ComputeLayerPCAScaler.name, compute.ComputeLayerPCAScaler::new);
		factories.put(compute.ComputeVarInOut.name, compute.ComputeVarInOut::new);
		factories.put(compute.ComputeOptimizer.name, compute.ComputeOptimizer::new);
		factories.put(compute.ComputeActivationSoftplus.name, compute.ComputeActivationSoftplus::new);
		factories.put(compute.ComputeOperationCos.name, compute.ComputeOperationCos::new);
		factories.put(compute.ComputeInitializerXavierUniform.name, compute.ComputeInitializerXavierUniform::new);
		factories.put(compute.ComputeInitializerUniformOut.name, compute.ComputeInitializerUniformOut::new);
		factories.put(compute.ComputeOperationArg.name, compute.ComputeOperationArg::new);
		factories.put(compute.ComputeActivationSoftSign.name, compute.ComputeActivationSoftSign::new);
		factories.put(compute.ComputeOptimizerAdaMax.name, compute.ComputeOptimizerAdaMax::new);
		factories.put(compute.ComputeInitializerLeCunUniform.name, compute.ComputeInitializerLeCunUniform::new);
		factories.put(compute.ComputeVarOptimize.name, compute.ComputeVarOptimize::new);
		factories.put(compute.ComputeInitializerUniformIn.name, compute.ComputeInitializerUniformIn::new);
		factories.put(compute.ComputeOperationAsin.name, compute.ComputeOperationAsin::new);
		factories.put(compute.ComputeOperationExp.name, compute.ComputeOperationExp::new);
		factories.put(compute.ComputeVarConst.name, compute.ComputeVarConst::new);
		factories.put(compute.ComputeOperationMul.name, compute.ComputeOperationMul::new);
		factories.put(compute.ComputeInitializerNormalIn.name, compute.ComputeInitializerNormalIn::new);
		factories.put(compute.ComputeInitializerLSTM.name, compute.ComputeInitializerLSTM::new);
		factories.put(compute.ComputeOperationLeCunTanh.name, compute.ComputeOperationLeCunTanh::new);
		factories.put(compute.ComputeOperationPow.name, compute.ComputeOperationPow::new);
		factories.put(compute.ComputeLayerLoss.name, compute.ComputeLayerLoss::new);
		factories.put(compute.ComputeOperation2In1Out.name, compute.ComputeOperation2In1Out::new);
		factories.put(compute.ComputeOptimizerNesterov.name, compute.ComputeOptimizerNesterov::new);
		factories.put(compute.ComputeInitializerIdentity.name, compute.ComputeInitializerIdentity::new);
		factories.put(compute.ComputeActivation.name, compute.ComputeActivation::new);
		factories.put(compute.ComputeOperationSin.name, compute.ComputeOperationSin::new);
		factories.put(compute.ComputeOperationAbs.name, compute.ComputeOperationAbs::new);
		factories.put(compute.ComputeInitializerConstant.name, compute.ComputeInitializerConstant::new);
		factories.put(compute.ComputeOperationAvg.name, compute.ComputeOperationAvg::new);
		factories.put(compute.ComputeOperationSumIf.name, compute.ComputeOperationSumIf::new);
		factories.put(compute.ComputeOptimizerAdaGrad.name, compute.ComputeOptimizerAdaGrad::new);
		factories.put(compute.ComputeLayerMinMaxScaler.name, compute.ComputeLayerMinMaxScaler::new);
		factories.put(compute.ComputeCounter.name, compute.ComputeCounter::new);
		factories.put(compute.ComputeVar.name, compute.ComputeVar::new);
		factories.put(compute.ComputeReduction.name, compute.ComputeReduction::new);
		factories.put(compute.ComputeInitializerNormal.name, compute.ComputeInitializerNormal::new);
		factories.put(compute.ComputeOperationNeg.name, compute.ComputeOperationNeg::new);
		factories.put(compute.ComputeOperationTan.name, compute.ComputeOperationTan::new);
		factories.put(compute.ComputeOperationRaiseToPower.name, compute.ComputeOperationRaiseToPower::new);
		factories.put(compute.ComputeOperationDiv.name, compute.ComputeOperationDiv::new);
		factories.put(compute.ComputeLayerLossClassification.name, compute.ComputeLayerLossClassification::new);
		factories.put(compute.ComputeOperationAcos.name, compute.ComputeOperationAcos::new);
		factories.put(compute.ComputeVariable.name, compute.ComputeVariable::new);
		factories.put(compute.ComputeLayerConfusion.name, compute.ComputeLayerConfusion::new);
		factories.put(compute.ComputeOperation1In1Out.name, compute.ComputeOperation1In1Out::new);
		factories.put(compute.ComputeModel.name, compute.ComputeModel::new);
		factories.put(compute.ComputeOperationAsinh.name, compute.ComputeOperationAsinh::new);
		factories.put(compute.ComputeOperationHardSigmoid.name, compute.ComputeOperationHardSigmoid::new);
		factories.put(compute.ComputeActivationTanh.name, compute.ComputeActivationTanh::new);
		factories.put(compute.ComputeRegularizer.name, compute.ComputeRegularizer::new);
		factories.put(compute.ComputeOperationTanh.name, compute.ComputeOperationTanh::new);
		factories.put(compute.ComputeLayer.name, compute.ComputeLayer::new);
		factories.put(compute.ComputeOptimizerAdaDelta.name, compute.ComputeOptimizerAdaDelta::new);
		factories.put(compute.ComputeOperationArgMax.name, compute.ComputeOperationArgMax::new);
		factories.put(compute.ComputeOperationSoftmax.name, compute.ComputeOperationSoftmax::new);
		factories.put(compute.ComputeLayerDense.name, compute.ComputeLayerDense::new);
		factories.put(compute.ComputeLayerCustom.name, compute.ComputeLayerCustom::new);
		factories.put(compute.ComputeVarProxy.name, compute.ComputeVarProxy::new);
		factories.put(compute.ComputeOperationEuclidean.name, compute.ComputeOperationEuclidean::new);
		factories.put(compute.ComputeInitializerGlorotUniform.name, compute.ComputeInitializerGlorotUniform::new);
		factories.put(compute.ComputeOperation.name, compute.ComputeOperation::new);
		factories.put(compute.ComputeActivationCelu.name, compute.ComputeActivationCelu::new);
		factories.put(compute.ComputeOperationCelu.name, compute.ComputeOperationCelu::new);
		factories.put(compute.ComputeOperationAddBias.name, compute.ComputeOperationAddBias::new);
		factories.put(compute.ComputeBinding.name, compute.ComputeBinding::new);
		factories.put(compute.ComputeActivationSoftmax.name, compute.ComputeActivationSoftmax::new);
		factories.put(compute.ComputeOperationRelu.name, compute.ComputeOperationRelu::new);
		factories.put(compute.ComputeOperationAdd.name, compute.ComputeOperationAdd::new);
		factories.put(compute.ComputeOperationLogSoftmax.name, compute.ComputeOperationLogSoftmax::new);
		factories.put(compute.ComputeOptimizerRmsProp.name, compute.ComputeOptimizerRmsProp::new);
		factories.put(compute.ComputeOperationArgMin.name, compute.ComputeOperationArgMin::new);
		factories.put(compute.ComputeActivationElu.name, compute.ComputeActivationElu::new);
		factories.put(compute.ComputeOperationSub.name, compute.ComputeOperationSub::new);
		factories.put(compute.ComputeOperationFilter.name, compute.ComputeOperationFilter::new);
		factories.put(compute.ComputeOperationSelu.name, compute.ComputeOperationSelu::new);
		factories.put(compute.ComputeOptimizerSgd.name, compute.ComputeOptimizerSgd::new);
		factories.put(compute.ComputeInitializer.name, compute.ComputeInitializer::new);
		factories.put(compute.ComputeLayerLSTM.name, compute.ComputeLayerLSTM::new);
		factories.put(compute.ComputeOptimizerMomentum.name, compute.ComputeOptimizerMomentum::new);
		factories.put(compute.ComputeLayerLossRegression.name, compute.ComputeLayerLossRegression::new);
		factories.put(compute.ComputeOperationSqrt.name, compute.ComputeOperationSqrt::new);
		factories.put(compute.ComputeOptimizerAdam.name, compute.ComputeOptimizerAdam::new);
		factories.put(compute.ComputeOperationSign.name, compute.ComputeOperationSign::new);
		factories.put(compute.ComputeActivationSigmoid.name, compute.ComputeActivationSigmoid::new);
		factories.put(compute.ComputeLayerLinear.name, compute.ComputeLayerLinear::new);
		factories.put(compute.ComputeInitializerNone.name, compute.ComputeInitializerNone::new);
		factories.put(compute.ComputeInitializerNormalAvg.name, compute.ComputeInitializerNormalAvg::new);
		factories.put(compute.ComputeInitializerSigmoidUniform.name, compute.ComputeInitializerSigmoidUniform::new);
		factories.put(compute.ComputeOperationLeakyRelu.name, compute.ComputeOperationLeakyRelu::new);
		factories.put(compute.ComputeActivationExp.name, compute.ComputeActivationExp::new);
		factories.put(compute.ComputeOperationSum.name, compute.ComputeOperationSum::new);
		factories.put(compute.ComputeOperationAtan.name, compute.ComputeOperationAtan::new);
		factories.put(compute.ComputeInitializerUniformAvg.name, compute.ComputeInitializerUniformAvg::new);
		factories.put(compute.ComputeInitializerReluUniform.name, compute.ComputeInitializerReluUniform::new);
		factories.put(compute.ComputeLayerFilter.name, compute.ComputeLayerFilter::new);
		factories.put(compute.ComputeRegressionLoss.name, compute.ComputeRegressionLoss::new);
		factories.put(compute.ComputeInitializerPytorch.name, compute.ComputeInitializerPytorch::new);
		factories.put(compute.ComputeOptimizerFtrl.name, compute.ComputeOptimizerFtrl::new);
		factories.put(compute.ComputeOperationAcosh.name, compute.ComputeOperationAcosh::new);
		factories.put(compute.ComputeOperationCosh.name, compute.ComputeOperationCosh::new);
		factories.put(compute.ComputeOperationScale.name, compute.ComputeOperationScale::new);
		factories.put(compute.ComputeInitializerUniform.name, compute.ComputeInitializerUniform::new);
		factories.put(compute.ComputeActivationRelu.name, compute.ComputeActivationRelu::new);
		factories.put(compute.ComputeLayerCall.name, compute.ComputeLayerCall::new);
		factories.put(compute.ComputeEngine.name, compute.ComputeEngine::new);
		loaders.put(compute.ComputeEngine.name, ai.greycat.algebra_n.compute.ComputeEngine::load);
		factories.put(nn_layers_names.NNLayersNames.name, nn_layers_names.NNLayersNames::new);
		factories.put(nn.AutoEncoderNetwork.name, nn.AutoEncoderNetwork::new);
		factories.put(nn.InitializerConfig.name, nn.InitializerConfig::new);
		factories.put(nn.ComputeInitializers.name, nn.ComputeInitializers::new);
		factories.put(nn.ComputeOptimizers.name, nn.ComputeOptimizers::new);
		factories.put(nn.NeuralNetwork.name, nn.NeuralNetwork::new);
		factories.put(nn.ComputeLayerTypes.name, nn.ComputeLayerTypes::new);
		factories.put(nn.ClassificationNetwork.name, nn.ClassificationNetwork::new);
		factories.put(nn.RegressionNetwork.name, nn.RegressionNetwork::new);
		factories.put(nn.ClassificationMetrics.name, nn.ClassificationMetrics::new);
		factories.put(nn.ComputeActivations.name, nn.ComputeActivations::new);
		factories.put(nn.PostProcessType.name, nn.PostProcessType::new);
		factories.put(nn.BindingsResult.name, nn.BindingsResult::new);
		factories.put(nn.PreProcessType.name, nn.PreProcessType::new);
		factories.put(kmeans.KmeanResult.name, kmeans.KmeanResult::new);
		factories.put(kmeans.KmeanMetaResult.name, kmeans.KmeanMetaResult::new);
		factories.put(kmeans.Kmeans.name, kmeans.Kmeans::new);
		factories.put(patterns.DTWPatternDetector.name, patterns.DTWPatternDetector::new);
		factories.put(patterns.ScoreDetailsSingleton.name, patterns.ScoreDetailsSingleton::new);
		factories.put(patterns.PatternDetector.name, patterns.PatternDetector::new);
		factories.put(patterns.PatternDetectionEngine.name, patterns.PatternDetectionEngine::new);
		factories.put(patterns.PatternDetectionSensitivity.name, patterns.PatternDetectionSensitivity::new);
		factories.put(patterns.SaxPatternDetectionEngine.name, patterns.SaxPatternDetectionEngine::new);
		factories.put(patterns.SamplingPolicy.name, patterns.SamplingPolicy::new);
		factories.put(patterns.DTWPatternDetectionEngine.name, patterns.DTWPatternDetectionEngine::new);
		factories.put(patterns.PatternDetectionEngineState.name, patterns.PatternDetectionEngineState::new);
		factories.put(patterns.RandomPatternDetector.name, patterns.RandomPatternDetector::new);
		factories.put(patterns.FFTPatternDetector.name, patterns.FFTPatternDetector::new);
		factories.put(patterns.ScoreDetails.name, patterns.ScoreDetails::new);
		factories.put(patterns.Detection.name, patterns.Detection::new);
		factories.put(patterns.EuclideanPatternDetectionEngine.name, patterns.EuclideanPatternDetectionEngine::new);
		factories.put(patterns.RandomPatternDetectionEngine.name, patterns.RandomPatternDetectionEngine::new);
		factories.put(patterns.PatternNullStrategy.name, patterns.PatternNullStrategy::new);
		factories.put(patterns.PatternDetectors.name, patterns.PatternDetectors::new);
		factories.put(patterns.MatchingNormalisation.name, patterns.MatchingNormalisation::new);
		factories.put(patterns.DistanceMetrics.name, patterns.DistanceMetrics::new);
		factories.put(patterns.EuclideanPatternDetector.name, patterns.EuclideanPatternDetector::new);
		factories.put(patterns.FFTResult.name, patterns.FFTResult::new);
		factories.put(patterns.OverlappingDetection.name, patterns.OverlappingDetection::new);
		factories.put(patterns.SaxPatternDetector.name, patterns.SaxPatternDetector::new);
		factories.put(ml.TimeSeriesDecomposition.name, ml.TimeSeriesDecomposition::new);
		factories.put(ml.PCA.name, ml.PCA::new);
		loaders.put(ml.PCA.name, ai.greycat.algebra_n.ml.PCA::load);
		factories.put(ml.GaussianND.name, ml.GaussianND::new);
		loaders.put(ml.GaussianND.name, ai.greycat.algebra_n.ml.GaussianND::load);
		factories.put(ml.HeatMapProfile.name, ml.HeatMapProfile::new);
		factories.put(ml.Polynomial.name, ml.Polynomial::new);
		loaders.put(ml.Polynomial.name, ai.greycat.algebra_n.ml.Polynomial::load);
		factories.put(ml.Solver.name, ml.Solver::new);
		factories.put(transforms.FFTModel.name, transforms.FFTModel::new);
		factories.put(powerflow.PowerBusResult.name, powerflow.PowerBusResult::new);
		factories.put(powerflow.PowerLineResult.name, powerflow.PowerLineResult::new);
	}
	@Override
	public void init(ai.greycat.GreyCat greycat) {
		this.mapped = new ai.greycat.GreyCat.Type[178];
		this.mapped[0] = greycat.types_by_name.get(compute.ComputeClassificationLoss.name);
		if(this.mapped[0] != null){
			this.mapped[0].resolveGeneratedOffsetWithValues("categorical_cross_entropy", "Categorical Cross Entropy","sparse_categorical_cross_entropy", "Sparse Categorical Cross Entropy");
		}
		this.mapped[1] = greycat.types_by_name.get(compute.ComputeLayerActivation.name);
		if(this.mapped[1] != null){
			this.mapped[1].resolveGeneratedOffsets("name","activation");
		}
		if(this.mapped[1] != null){
			this.mapped[1].static_values = new java.lang.Object[]{"input","output"};
		}
		this.mapped[2] = greycat.types_by_name.get(compute.ComputeOperationClip.name);
		if(this.mapped[2] != null){
			this.mapped[2].resolveGeneratedOffsets("input","output","min","max");
		}
		this.mapped[3] = greycat.types_by_name.get(compute.ComputeInitializerXavier.name);
		this.mapped[4] = greycat.types_by_name.get(compute.ComputeOperationAtanh.name);
		if(this.mapped[4] != null){
			this.mapped[4].resolveGeneratedOffsets("input","output");
		}
		this.mapped[5] = greycat.types_by_name.get(compute.ComputeInitializerRelu.name);
		this.mapped[6] = greycat.types_by_name.get(compute.ComputeOperationSoftSign.name);
		if(this.mapped[6] != null){
			this.mapped[6].resolveGeneratedOffsets("input","output");
		}
		this.mapped[7] = greycat.types_by_name.get(compute.ComputeOperationSinh.name);
		if(this.mapped[7] != null){
			this.mapped[7].resolveGeneratedOffsets("input","output");
		}
		this.mapped[8] = greycat.types_by_name.get(compute.ComputeState.name);
		this.mapped[9] = greycat.types_by_name.get(compute.ComputeActivationSelu.name);
		this.mapped[10] = greycat.types_by_name.get(compute.ComputeLayerClassification.name);
		if(this.mapped[10] != null){
			this.mapped[10].resolveGeneratedOffsets("name","calculate_probabilities","from_logits");
		}
		if(this.mapped[10] != null){
			this.mapped[10].static_values = new java.lang.Object[]{"input","predicted_classes","probabilities"};
		}
		this.mapped[11] = greycat.types_by_name.get(compute.ComputeInitializerNormalOut.name);
		this.mapped[12] = greycat.types_by_name.get(compute.ComputeActivationLeakyRelu.name);
		if(this.mapped[12] != null){
			this.mapped[12].resolveGeneratedOffsets("alpha","max_value","threshold");
		}
		if(this.mapped[12] != null){
			this.mapped[12].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4599075939470750515L),java.lang.Double.longBitsToDouble(0L)};
		}
		this.mapped[13] = greycat.types_by_name.get(compute.ComputeOperationFill.name);
		if(this.mapped[13] != null){
			this.mapped[13].resolveGeneratedOffsets("input","value");
		}
		this.mapped[14] = greycat.types_by_name.get(compute.ComputeOptimizerNadam.name);
		if(this.mapped[14] != null){
			this.mapped[14].resolveGeneratedOffsets("learning_rate","beta1","beta2","smooth_epsilon");
		}
		if(this.mapped[14] != null){
			this.mapped[14].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4562254508917369340L),java.lang.Double.longBitsToDouble(4606281698874543309L),java.lang.Double.longBitsToDouble(4607173411600762667L),java.lang.Double.longBitsToDouble(4502148214488346440L)};
		}
		this.mapped[15] = greycat.types_by_name.get(compute.ComputeActivationHardSigmoid.name);
		if(this.mapped[15] != null){
			this.mapped[15].resolveGeneratedOffsets("slope","shift");
		}
		if(this.mapped[15] != null){
			this.mapped[15].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4596373779694328218L),java.lang.Double.longBitsToDouble(4602678819172646912L)};
		}
		this.mapped[16] = greycat.types_by_name.get(compute.ComputeLayerStandardScaler.name);
		if(this.mapped[16] != null){
			this.mapped[16].resolveGeneratedOffsets("name","type","inverse_transform");
		}
		if(this.mapped[16] != null){
			this.mapped[16].static_values = new java.lang.Object[]{"input","output","avg","std"};
		}
		this.mapped[17] = greycat.types_by_name.get(compute.ComputeOperationMatMul.name);
		if(this.mapped[17] != null){
			this.mapped[17].resolveGeneratedOffsets("input","input2","output","transposeA","transposeB","alpha","beta");
		}
		if(this.mapped[17] != null){
			this.mapped[17].static_values = new java.lang.Object[]{false,java.lang.Double.longBitsToDouble(4607182418800017408L),java.lang.Double.longBitsToDouble(0L)};
		}
		this.mapped[18] = greycat.types_by_name.get(compute.ComputeLayerSeq.name);
		if(this.mapped[18] != null){
			this.mapped[18].resolveGeneratedOffsets("name","calls","optimizer");
		}
		this.mapped[19] = greycat.types_by_name.get(compute.ComputeOperationSoftplus.name);
		if(this.mapped[19] != null){
			this.mapped[19].resolveGeneratedOffsets("input","output");
		}
		this.mapped[20] = greycat.types_by_name.get(compute.ComputeOperationElu.name);
		if(this.mapped[20] != null){
			this.mapped[20].resolveGeneratedOffsets("input","output","alpha");
		}
		if(this.mapped[20] != null){
			this.mapped[20].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4607182418800017408L)};
		}
		this.mapped[21] = greycat.types_by_name.get(compute.ComputeOperationLog.name);
		if(this.mapped[21] != null){
			this.mapped[21].resolveGeneratedOffsets("input","output");
		}
		this.mapped[22] = greycat.types_by_name.get(compute.ComputeOperationSigmoid.name);
		if(this.mapped[22] != null){
			this.mapped[22].resolveGeneratedOffsets("input","output");
		}
		this.mapped[23] = greycat.types_by_name.get(compute.ComputeLayerPCAScaler.name);
		if(this.mapped[23] != null){
			this.mapped[23].resolveGeneratedOffsets("name","type","inverse_transform");
		}
		if(this.mapped[23] != null){
			this.mapped[23].static_values = new java.lang.Object[]{"input","output","avg","std","space"};
		}
		this.mapped[24] = greycat.types_by_name.get(compute.ComputeVarInOut.name);
		if(this.mapped[24] != null){
			this.mapped[24].resolveGeneratedOffsets("name","type","shape","with_grad");
		}
		this.mapped[25] = greycat.types_by_name.get(compute.ComputeOptimizer.name);
		if(this.mapped[25] != null){
			this.mapped[25].resolveGeneratedOffsets("learning_rate");
		}
		this.mapped[26] = greycat.types_by_name.get(compute.ComputeActivationSoftplus.name);
		this.mapped[27] = greycat.types_by_name.get(compute.ComputeOperationCos.name);
		if(this.mapped[27] != null){
			this.mapped[27].resolveGeneratedOffsets("input","output");
		}
		this.mapped[28] = greycat.types_by_name.get(compute.ComputeInitializerXavierUniform.name);
		this.mapped[29] = greycat.types_by_name.get(compute.ComputeInitializerUniformOut.name);
		this.mapped[30] = greycat.types_by_name.get(compute.ComputeOperationArg.name);
		if(this.mapped[30] != null){
			this.mapped[30].resolveGeneratedOffsets("input","output","output2");
		}
		this.mapped[31] = greycat.types_by_name.get(compute.ComputeActivationSoftSign.name);
		this.mapped[32] = greycat.types_by_name.get(compute.ComputeOptimizerAdaMax.name);
		if(this.mapped[32] != null){
			this.mapped[32].resolveGeneratedOffsets("learning_rate","beta1","beta2","smooth_epsilon");
		}
		if(this.mapped[32] != null){
			this.mapped[32].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4562254508917369340L),java.lang.Double.longBitsToDouble(4606281698874543309L),java.lang.Double.longBitsToDouble(4607173411600762667L),java.lang.Double.longBitsToDouble(4502148214488346440L)};
		}
		this.mapped[33] = greycat.types_by_name.get(compute.ComputeInitializerLeCunUniform.name);
		this.mapped[34] = greycat.types_by_name.get(compute.ComputeVarOptimize.name);
		if(this.mapped[34] != null){
			this.mapped[34].resolveGeneratedOffsets("name","type","shape","l1","l2","init");
		}
		this.mapped[35] = greycat.types_by_name.get(compute.ComputeInitializerUniformIn.name);
		this.mapped[36] = greycat.types_by_name.get(compute.ComputeOperationAsin.name);
		if(this.mapped[36] != null){
			this.mapped[36].resolveGeneratedOffsets("input","output");
		}
		this.mapped[37] = greycat.types_by_name.get(compute.ComputeOperationExp.name);
		if(this.mapped[37] != null){
			this.mapped[37].resolveGeneratedOffsets("input","output");
		}
		this.mapped[38] = greycat.types_by_name.get(compute.ComputeVarConst.name);
		if(this.mapped[38] != null){
			this.mapped[38].resolveGeneratedOffsets("name","type","shape");
		}
		this.mapped[39] = greycat.types_by_name.get(compute.ComputeOperationMul.name);
		if(this.mapped[39] != null){
			this.mapped[39].resolveGeneratedOffsets("input","input2","output");
		}
		this.mapped[40] = greycat.types_by_name.get(compute.ComputeInitializerNormalIn.name);
		this.mapped[41] = greycat.types_by_name.get(compute.ComputeInitializerLSTM.name);
		this.mapped[42] = greycat.types_by_name.get(compute.ComputeOperationLeCunTanh.name);
		if(this.mapped[42] != null){
			this.mapped[42].resolveGeneratedOffsets("input","output");
		}
		this.mapped[43] = greycat.types_by_name.get(compute.ComputeOperationPow.name);
		if(this.mapped[43] != null){
			this.mapped[43].resolveGeneratedOffsets("input","input2","output");
		}
		this.mapped[44] = greycat.types_by_name.get(compute.ComputeLayerLoss.name);
		if(this.mapped[44] != null){
			this.mapped[44].resolveGeneratedOffsets("name","reduction");
		}
		if(this.mapped[44] != null){
			this.mapped[44].static_values = new java.lang.Object[]{"computed","expected","loss"};
		}
		this.mapped[45] = greycat.types_by_name.get(compute.ComputeOperation2In1Out.name);
		if(this.mapped[45] != null){
			this.mapped[45].resolveGeneratedOffsets("input","input2","output");
		}
		this.mapped[46] = greycat.types_by_name.get(compute.ComputeOptimizerNesterov.name);
		if(this.mapped[46] != null){
			this.mapped[46].resolveGeneratedOffsets("learning_rate","decay_rate");
		}
		if(this.mapped[46] != null){
			this.mapped[46].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4562254508917369340L),java.lang.Double.longBitsToDouble(4606281698874543309L)};
		}
		this.mapped[47] = greycat.types_by_name.get(compute.ComputeInitializerIdentity.name);
		this.mapped[48] = greycat.types_by_name.get(compute.ComputeActivation.name);
		this.mapped[49] = greycat.types_by_name.get(compute.ComputeOperationSin.name);
		if(this.mapped[49] != null){
			this.mapped[49].resolveGeneratedOffsets("input","output");
		}
		this.mapped[50] = greycat.types_by_name.get(compute.ComputeOperationAbs.name);
		if(this.mapped[50] != null){
			this.mapped[50].resolveGeneratedOffsets("input","output");
		}
		this.mapped[51] = greycat.types_by_name.get(compute.ComputeInitializerConstant.name);
		if(this.mapped[51] != null){
			this.mapped[51].resolveGeneratedOffsets("value");
		}
		this.mapped[52] = greycat.types_by_name.get(compute.ComputeOperationAvg.name);
		if(this.mapped[52] != null){
			this.mapped[52].resolveGeneratedOffsets("input","input2","output");
		}
		this.mapped[53] = greycat.types_by_name.get(compute.ComputeOperationSumIf.name);
		if(this.mapped[53] != null){
			this.mapped[53].resolveGeneratedOffsets("input","ifCondition","output","counts","classes");
		}
		this.mapped[54] = greycat.types_by_name.get(compute.ComputeOptimizerAdaGrad.name);
		if(this.mapped[54] != null){
			this.mapped[54].resolveGeneratedOffsets("learning_rate","initial_accumulator","smooth_epsilon");
		}
		if(this.mapped[54] != null){
			this.mapped[54].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4562254508917369340L),java.lang.Double.longBitsToDouble(4591870180066957722L),java.lang.Double.longBitsToDouble(4502148214488346440L)};
		}
		this.mapped[55] = greycat.types_by_name.get(compute.ComputeLayerMinMaxScaler.name);
		if(this.mapped[55] != null){
			this.mapped[55].resolveGeneratedOffsets("name","type","inverse_transform");
		}
		if(this.mapped[55] != null){
			this.mapped[55].static_values = new java.lang.Object[]{"input","output","min","max"};
		}
		this.mapped[56] = greycat.types_by_name.get(compute.ComputeCounter.name);
		if(this.mapped[56] != null){
			this.mapped[56].resolveGeneratedOffsets("epoch","optimizationSteps","batchNotOptimized");
		}
		this.mapped[57] = greycat.types_by_name.get(compute.ComputeVar.name);
		if(this.mapped[57] != null){
			this.mapped[57].resolveGeneratedOffsets("name");
		}
		this.mapped[58] = greycat.types_by_name.get(compute.ComputeReduction.name);
		if(this.mapped[58] != null){
			this.mapped[58].resolveGeneratedOffsetWithValues("auto", "auto","none", "none","sum", "sum","mean", "mean","disabled", "disabled");
		}
		this.mapped[59] = greycat.types_by_name.get(compute.ComputeInitializerNormal.name);
		if(this.mapped[59] != null){
			this.mapped[59].resolveGeneratedOffsets("avg","std");
		}
		this.mapped[60] = greycat.types_by_name.get(compute.ComputeOperationNeg.name);
		if(this.mapped[60] != null){
			this.mapped[60].resolveGeneratedOffsets("input","output");
		}
		this.mapped[61] = greycat.types_by_name.get(compute.ComputeOperationTan.name);
		if(this.mapped[61] != null){
			this.mapped[61].resolveGeneratedOffsets("input","output");
		}
		this.mapped[62] = greycat.types_by_name.get(compute.ComputeOperationRaiseToPower.name);
		if(this.mapped[62] != null){
			this.mapped[62].resolveGeneratedOffsets("input","output","power");
		}
		this.mapped[63] = greycat.types_by_name.get(compute.ComputeOperationDiv.name);
		if(this.mapped[63] != null){
			this.mapped[63].resolveGeneratedOffsets("input","input2","output");
		}
		this.mapped[64] = greycat.types_by_name.get(compute.ComputeLayerLossClassification.name);
		if(this.mapped[64] != null){
			this.mapped[64].resolveGeneratedOffsets("name","reduction","loss_type","has_class_weights","calculate_probabilities","from_logits");
		}
		if(this.mapped[64] != null){
			this.mapped[64].static_values = new java.lang.Object[]{"class_weights","predicted_classes","probabilities","sum_reduce"};
		}
		this.mapped[65] = greycat.types_by_name.get(compute.ComputeOperationAcos.name);
		if(this.mapped[65] != null){
			this.mapped[65].resolveGeneratedOffsets("input","output");
		}
		this.mapped[66] = greycat.types_by_name.get(compute.ComputeVariable.name);
		if(this.mapped[66] != null){
			this.mapped[66].resolveGeneratedOffsets("name");
		}
		this.mapped[67] = greycat.types_by_name.get(compute.ComputeLayerConfusion.name);
		if(this.mapped[67] != null){
			this.mapped[67].resolveGeneratedOffsets("name","nbClass");
		}
		if(this.mapped[67] != null){
			this.mapped[67].static_values = new java.lang.Object[]{"computed","expected","confusion"};
		}
		this.mapped[68] = greycat.types_by_name.get(compute.ComputeOperation1In1Out.name);
		if(this.mapped[68] != null){
			this.mapped[68].resolveGeneratedOffsets("input","output");
		}
		this.mapped[69] = greycat.types_by_name.get(compute.ComputeModel.name);
		if(this.mapped[69] != null){
			this.mapped[69].resolveGeneratedOffsets("layers");
		}
		this.mapped[70] = greycat.types_by_name.get(compute.ComputeOperationAsinh.name);
		if(this.mapped[70] != null){
			this.mapped[70].resolveGeneratedOffsets("input","output");
		}
		this.mapped[71] = greycat.types_by_name.get(compute.ComputeOperationHardSigmoid.name);
		if(this.mapped[71] != null){
			this.mapped[71].resolveGeneratedOffsets("input","output","slope","shift");
		}
		if(this.mapped[71] != null){
			this.mapped[71].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4596373779694328218L),java.lang.Double.longBitsToDouble(4602678819172646912L)};
		}
		this.mapped[72] = greycat.types_by_name.get(compute.ComputeActivationTanh.name);
		this.mapped[73] = greycat.types_by_name.get(compute.ComputeRegularizer.name);
		if(this.mapped[73] != null){
			this.mapped[73].resolveGeneratedOffsets("l1","l2");
		}
		this.mapped[74] = greycat.types_by_name.get(compute.ComputeOperationTanh.name);
		if(this.mapped[74] != null){
			this.mapped[74].resolveGeneratedOffsets("input","output");
		}
		this.mapped[75] = greycat.types_by_name.get(compute.ComputeLayer.name);
		if(this.mapped[75] != null){
			this.mapped[75].resolveGeneratedOffsets("name");
		}
		this.mapped[76] = greycat.types_by_name.get(compute.ComputeOptimizerAdaDelta.name);
		if(this.mapped[76] != null){
			this.mapped[76].resolveGeneratedOffsets("learning_rate","decay_rate","smooth_epsilon");
		}
		if(this.mapped[76] != null){
			this.mapped[76].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4562254508917369340L),java.lang.Double.longBitsToDouble(4606732058837280358L),java.lang.Double.longBitsToDouble(4502148214488346440L)};
		}
		this.mapped[77] = greycat.types_by_name.get(compute.ComputeOperationArgMax.name);
		if(this.mapped[77] != null){
			this.mapped[77].resolveGeneratedOffsets("input","output","output2");
		}
		this.mapped[78] = greycat.types_by_name.get(compute.ComputeOperationSoftmax.name);
		if(this.mapped[78] != null){
			this.mapped[78].resolveGeneratedOffsets("input","output");
		}
		this.mapped[79] = greycat.types_by_name.get(compute.ComputeLayerDense.name);
		if(this.mapped[79] != null){
			this.mapped[79].resolveGeneratedOffsets("name","type","inputs","outputs","use_bias","weight_initializer","weight_regularizer","bias_initializer","bias_regularizer","activation");
		}
		if(this.mapped[79] != null){
			this.mapped[79].static_values = new java.lang.Object[]{"input","output","weight","bias","mult","pre_activation"};
		}
		this.mapped[80] = greycat.types_by_name.get(compute.ComputeLayerCustom.name);
		if(this.mapped[80] != null){
			this.mapped[80].resolveGeneratedOffsets("name","ops","vars");
		}
		this.mapped[81] = greycat.types_by_name.get(compute.ComputeVarProxy.name);
		if(this.mapped[81] != null){
			this.mapped[81].resolveGeneratedOffsets("name");
		}
		this.mapped[82] = greycat.types_by_name.get(compute.ComputeOperationEuclidean.name);
		if(this.mapped[82] != null){
			this.mapped[82].resolveGeneratedOffsets("input","input2","output");
		}
		this.mapped[83] = greycat.types_by_name.get(compute.ComputeInitializerGlorotUniform.name);
		this.mapped[84] = greycat.types_by_name.get(compute.ComputeOperation.name);
		this.mapped[85] = greycat.types_by_name.get(compute.ComputeActivationCelu.name);
		if(this.mapped[85] != null){
			this.mapped[85].resolveGeneratedOffsets("alpha");
		}
		if(this.mapped[85] != null){
			this.mapped[85].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4607182418800017408L)};
		}
		this.mapped[86] = greycat.types_by_name.get(compute.ComputeOperationCelu.name);
		if(this.mapped[86] != null){
			this.mapped[86].resolveGeneratedOffsets("input","output","alpha");
		}
		if(this.mapped[86] != null){
			this.mapped[86].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4607182418800017408L)};
		}
		this.mapped[87] = greycat.types_by_name.get(compute.ComputeOperationAddBias.name);
		if(this.mapped[87] != null){
			this.mapped[87].resolveGeneratedOffsets("input","input2","output");
		}
		this.mapped[88] = greycat.types_by_name.get(compute.ComputeBinding.name);
		if(this.mapped[88] != null){
			this.mapped[88].resolveGeneratedOffsets("src_layer_name","src_var_name","target_var_name");
		}
		this.mapped[89] = greycat.types_by_name.get(compute.ComputeActivationSoftmax.name);
		if(this.mapped[89] != null){
			this.mapped[89].resolveGeneratedOffsets("classes");
		}
		this.mapped[90] = greycat.types_by_name.get(compute.ComputeOperationRelu.name);
		if(this.mapped[90] != null){
			this.mapped[90].resolveGeneratedOffsets("input","output","max_value","threshold");
		}
		if(this.mapped[90] != null){
			this.mapped[90].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(0L)};
		}
		this.mapped[91] = greycat.types_by_name.get(compute.ComputeOperationAdd.name);
		if(this.mapped[91] != null){
			this.mapped[91].resolveGeneratedOffsets("input","input2","output");
		}
		this.mapped[92] = greycat.types_by_name.get(compute.ComputeOperationLogSoftmax.name);
		if(this.mapped[92] != null){
			this.mapped[92].resolveGeneratedOffsets("input","output","axis");
		}
		this.mapped[93] = greycat.types_by_name.get(compute.ComputeOptimizerRmsProp.name);
		if(this.mapped[93] != null){
			this.mapped[93].resolveGeneratedOffsets("learning_rate","decay_rate","smooth_epsilon");
		}
		if(this.mapped[93] != null){
			this.mapped[93].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4562254508917369340L),java.lang.Double.longBitsToDouble(4606281698874543309L),java.lang.Double.longBitsToDouble(4502148214488346440L)};
		}
		this.mapped[94] = greycat.types_by_name.get(compute.ComputeOperationArgMin.name);
		if(this.mapped[94] != null){
			this.mapped[94].resolveGeneratedOffsets("input","output","output2");
		}
		this.mapped[95] = greycat.types_by_name.get(compute.ComputeActivationElu.name);
		if(this.mapped[95] != null){
			this.mapped[95].resolveGeneratedOffsets("alpha");
		}
		if(this.mapped[95] != null){
			this.mapped[95].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4607182418800017408L)};
		}
		this.mapped[96] = greycat.types_by_name.get(compute.ComputeOperationSub.name);
		if(this.mapped[96] != null){
			this.mapped[96].resolveGeneratedOffsets("input","input2","output");
		}
		this.mapped[97] = greycat.types_by_name.get(compute.ComputeOperationFilter.name);
		if(this.mapped[97] != null){
			this.mapped[97].resolveGeneratedOffsets("input","output","mask","nbOutputs");
		}
		this.mapped[98] = greycat.types_by_name.get(compute.ComputeOperationSelu.name);
		if(this.mapped[98] != null){
			this.mapped[98].resolveGeneratedOffsets("input","output");
		}
		this.mapped[99] = greycat.types_by_name.get(compute.ComputeOptimizerSgd.name);
		if(this.mapped[99] != null){
			this.mapped[99].resolveGeneratedOffsets("learning_rate");
		}
		if(this.mapped[99] != null){
			this.mapped[99].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4576918229304087675L)};
		}
		this.mapped[100] = greycat.types_by_name.get(compute.ComputeInitializer.name);
		this.mapped[101] = greycat.types_by_name.get(compute.ComputeLayerLSTM.name);
		if(this.mapped[101] != null){
			this.mapped[101].resolveGeneratedOffsets("name","bias_initializer","weight_regularizer","bias_regularizer","type","use_bias","return_sequences","bidirectional","auto_init_states","inputs","outputs","layers","sequences");
		}
		if(this.mapped[101] != null){
			this.mapped[101].static_values = new java.lang.Object[]{"input","output","hx","cx","hy","cy","weight","bias","internal_i","internal_f","internal_cp","internal_o","internal_h","internal_c","internal_mult","internal_output"};
		}
		this.mapped[102] = greycat.types_by_name.get(compute.ComputeOptimizerMomentum.name);
		if(this.mapped[102] != null){
			this.mapped[102].resolveGeneratedOffsets("learning_rate","decay_rate");
		}
		if(this.mapped[102] != null){
			this.mapped[102].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4562254508917369340L),java.lang.Double.longBitsToDouble(4606281698874543309L)};
		}
		this.mapped[103] = greycat.types_by_name.get(compute.ComputeLayerLossRegression.name);
		if(this.mapped[103] != null){
			this.mapped[103].resolveGeneratedOffsets("name","reduction","loss_type");
		}
		this.mapped[104] = greycat.types_by_name.get(compute.ComputeOperationSqrt.name);
		if(this.mapped[104] != null){
			this.mapped[104].resolveGeneratedOffsets("input","output");
		}
		this.mapped[105] = greycat.types_by_name.get(compute.ComputeOptimizerAdam.name);
		if(this.mapped[105] != null){
			this.mapped[105].resolveGeneratedOffsets("learning_rate","beta1","beta2","smooth_epsilon");
		}
		if(this.mapped[105] != null){
			this.mapped[105].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4562254508917369340L),java.lang.Double.longBitsToDouble(4606281698874543309L),java.lang.Double.longBitsToDouble(4607173411600762667L),java.lang.Double.longBitsToDouble(4502148214488346440L)};
		}
		this.mapped[106] = greycat.types_by_name.get(compute.ComputeOperationSign.name);
		if(this.mapped[106] != null){
			this.mapped[106].resolveGeneratedOffsets("input","output");
		}
		this.mapped[107] = greycat.types_by_name.get(compute.ComputeActivationSigmoid.name);
		this.mapped[108] = greycat.types_by_name.get(compute.ComputeLayerLinear.name);
		if(this.mapped[108] != null){
			this.mapped[108].resolveGeneratedOffsets("name","type","inputs","outputs","use_bias","weight_initializer","weight_regularizer","bias_initializer","bias_regularizer");
		}
		if(this.mapped[108] != null){
			this.mapped[108].static_values = new java.lang.Object[]{"input","output","weight","bias","mult"};
		}
		this.mapped[109] = greycat.types_by_name.get(compute.ComputeInitializerNone.name);
		this.mapped[110] = greycat.types_by_name.get(compute.ComputeInitializerNormalAvg.name);
		this.mapped[111] = greycat.types_by_name.get(compute.ComputeInitializerSigmoidUniform.name);
		this.mapped[112] = greycat.types_by_name.get(compute.ComputeOperationLeakyRelu.name);
		if(this.mapped[112] != null){
			this.mapped[112].resolveGeneratedOffsets("input","output","alpha","max_value","threshold");
		}
		if(this.mapped[112] != null){
			this.mapped[112].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4599075939470750515L),java.lang.Double.longBitsToDouble(9218868437227405311L),java.lang.Double.longBitsToDouble(0L)};
		}
		this.mapped[113] = greycat.types_by_name.get(compute.ComputeActivationExp.name);
		this.mapped[114] = greycat.types_by_name.get(compute.ComputeOperationSum.name);
		if(this.mapped[114] != null){
			this.mapped[114].resolveGeneratedOffsets("input","output","axis");
		}
		this.mapped[115] = greycat.types_by_name.get(compute.ComputeOperationAtan.name);
		if(this.mapped[115] != null){
			this.mapped[115].resolveGeneratedOffsets("input","output");
		}
		this.mapped[116] = greycat.types_by_name.get(compute.ComputeInitializerUniformAvg.name);
		this.mapped[117] = greycat.types_by_name.get(compute.ComputeInitializerReluUniform.name);
		this.mapped[118] = greycat.types_by_name.get(compute.ComputeLayerFilter.name);
		if(this.mapped[118] != null){
			this.mapped[118].resolveGeneratedOffsets("name","type","inputs","outputs","maskValues");
		}
		if(this.mapped[118] != null){
			this.mapped[118].static_values = new java.lang.Object[]{"input","output","mask"};
		}
		this.mapped[119] = greycat.types_by_name.get(compute.ComputeRegressionLoss.name);
		if(this.mapped[119] != null){
			this.mapped[119].resolveGeneratedOffsetWithValues("square", "Square","abs", "Abs");
		}
		this.mapped[120] = greycat.types_by_name.get(compute.ComputeInitializerPytorch.name);
		this.mapped[121] = greycat.types_by_name.get(compute.ComputeOptimizerFtrl.name);
		if(this.mapped[121] != null){
			this.mapped[121].resolveGeneratedOffsets("learning_rate","lambda1","lambda2","beta");
		}
		if(this.mapped[121] != null){
			this.mapped[121].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4562254508917369340L),java.lang.Double.longBitsToDouble(0L),java.lang.Double.longBitsToDouble(0L),java.lang.Double.longBitsToDouble(0L)};
		}
		this.mapped[122] = greycat.types_by_name.get(compute.ComputeOperationAcosh.name);
		if(this.mapped[122] != null){
			this.mapped[122].resolveGeneratedOffsets("input","output");
		}
		this.mapped[123] = greycat.types_by_name.get(compute.ComputeOperationCosh.name);
		if(this.mapped[123] != null){
			this.mapped[123].resolveGeneratedOffsets("input","output");
		}
		this.mapped[124] = greycat.types_by_name.get(compute.ComputeOperationScale.name);
		if(this.mapped[124] != null){
			this.mapped[124].resolveGeneratedOffsets("input","output","alpha");
		}
		this.mapped[125] = greycat.types_by_name.get(compute.ComputeInitializerUniform.name);
		if(this.mapped[125] != null){
			this.mapped[125].resolveGeneratedOffsets("min","max");
		}
		this.mapped[126] = greycat.types_by_name.get(compute.ComputeActivationRelu.name);
		if(this.mapped[126] != null){
			this.mapped[126].resolveGeneratedOffsets("max_value","threshold");
		}
		if(this.mapped[126] != null){
			this.mapped[126].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(0L)};
		}
		this.mapped[127] = greycat.types_by_name.get(compute.ComputeLayerCall.name);
		if(this.mapped[127] != null){
			this.mapped[127].resolveGeneratedOffsets("layer_name","bindings");
		}
		this.mapped[128] = greycat.types_by_name.get(compute.ComputeEngine.name);
		this.mapped[129] = greycat.types_by_name.get(nn_layers_names.NNLayersNames.name);
		if(this.mapped[129] != null){
			this.mapped[129].resolveGeneratedOffsetWithValues("layer_0", "layer_0","layer_1", "layer_1","layer_2", "layer_2","layer_3", "layer_3","layer_4", "layer_4","layer_5", "layer_5","layer_6", "layer_6","layer_7", "layer_7","layer_8", "layer_8","layer_9", "layer_9","layer_10", "layer_10","layer_11", "layer_11","layer_12", "layer_12","layer_13", "layer_13","layer_14", "layer_14","layer_15", "layer_15","layer_16", "layer_16","layer_17", "layer_17","layer_18", "layer_18","layer_19", "layer_19","layer_20", "layer_20","layer_21", "layer_21","layer_22", "layer_22","layer_23", "layer_23","layer_24", "layer_24","layer_25", "layer_25","layer_26", "layer_26","layer_27", "layer_27","layer_28", "layer_28","layer_29", "layer_29","layer_30", "layer_30","layer_31", "layer_31","layer_32", "layer_32","layer_33", "layer_33","layer_34", "layer_34","layer_35", "layer_35","layer_36", "layer_36","layer_37", "layer_37","layer_38", "layer_38","layer_39", "layer_39","layer_40", "layer_40","layer_41", "layer_41","layer_42", "layer_42","layer_43", "layer_43","layer_44", "layer_44","layer_45", "layer_45","layer_46", "layer_46","layer_47", "layer_47","layer_48", "layer_48","layer_49", "layer_49","layer_50", "layer_50","layer_51", "layer_51","layer_52", "layer_52","layer_53", "layer_53","layer_54", "layer_54","layer_55", "layer_55","layer_56", "layer_56","layer_57", "layer_57","layer_58", "layer_58","layer_59", "layer_59","layer_60", "layer_60","layer_61", "layer_61","layer_62", "layer_62","layer_63", "layer_63","layer_64", "layer_64","layer_65", "layer_65","layer_66", "layer_66","layer_67", "layer_67","layer_68", "layer_68","layer_69", "layer_69","layer_70", "layer_70","layer_71", "layer_71","layer_72", "layer_72","layer_73", "layer_73","layer_74", "layer_74","layer_75", "layer_75","layer_76", "layer_76","layer_77", "layer_77","layer_78", "layer_78","layer_79", "layer_79","layer_80", "layer_80","layer_81", "layer_81","layer_82", "layer_82","layer_83", "layer_83","layer_84", "layer_84","layer_85", "layer_85","layer_86", "layer_86","layer_87", "layer_87","layer_88", "layer_88","layer_89", "layer_89","layer_90", "layer_90","layer_91", "layer_91","layer_92", "layer_92","layer_93", "layer_93","layer_94", "layer_94","layer_95", "layer_95","layer_96", "layer_96","layer_97", "layer_97","layer_98", "layer_98","layer_99", "layer_99","layer_100", "layer_100","layer_101", "layer_101","layer_102", "layer_102","layer_103", "layer_103","layer_104", "layer_104","layer_105", "layer_105","layer_106", "layer_106","layer_107", "layer_107","layer_108", "layer_108","layer_109", "layer_109","layer_110", "layer_110","layer_111", "layer_111","layer_112", "layer_112","layer_113", "layer_113","layer_114", "layer_114","layer_115", "layer_115","layer_116", "layer_116","layer_117", "layer_117","layer_118", "layer_118","layer_119", "layer_119","layer_120", "layer_120","layer_121", "layer_121","layer_122", "layer_122","layer_123", "layer_123","layer_124", "layer_124","layer_125", "layer_125","layer_126", "layer_126","layer_127", "layer_127","layer_128", "layer_128","layer_129", "layer_129","layer_130", "layer_130","layer_131", "layer_131","layer_132", "layer_132","layer_133", "layer_133","layer_134", "layer_134","layer_135", "layer_135","layer_136", "layer_136","layer_137", "layer_137","layer_138", "layer_138","layer_139", "layer_139","layer_140", "layer_140","layer_141", "layer_141","layer_142", "layer_142","layer_143", "layer_143","layer_144", "layer_144","layer_145", "layer_145","layer_146", "layer_146","layer_147", "layer_147","layer_148", "layer_148","layer_149", "layer_149","layer_150", "layer_150","layer_151", "layer_151","layer_152", "layer_152","layer_153", "layer_153","layer_154", "layer_154","layer_155", "layer_155","layer_156", "layer_156","layer_157", "layer_157","layer_158", "layer_158","layer_159", "layer_159","layer_160", "layer_160","layer_161", "layer_161","layer_162", "layer_162","layer_163", "layer_163","layer_164", "layer_164","layer_165", "layer_165","layer_166", "layer_166","layer_167", "layer_167","layer_168", "layer_168","layer_169", "layer_169","layer_170", "layer_170","layer_171", "layer_171","layer_172", "layer_172","layer_173", "layer_173","layer_174", "layer_174","layer_175", "layer_175","layer_176", "layer_176","layer_177", "layer_177","layer_178", "layer_178","layer_179", "layer_179","layer_180", "layer_180","layer_181", "layer_181","layer_182", "layer_182","layer_183", "layer_183","layer_184", "layer_184","layer_185", "layer_185","layer_186", "layer_186","layer_187", "layer_187","layer_188", "layer_188","layer_189", "layer_189","layer_190", "layer_190","layer_191", "layer_191","layer_192", "layer_192","layer_193", "layer_193","layer_194", "layer_194","layer_195", "layer_195","layer_196", "layer_196","layer_197", "layer_197","layer_198", "layer_198","layer_199", "layer_199");
		}
		this.mapped[130] = greycat.types_by_name.get(nn.AutoEncoderNetwork.name);
		if(this.mapped[130] != null){
			this.mapped[130].resolveGeneratedOffsets("inputs","inputs_gradients","outputs","fixed_batch_size","inputs_sequences","outputs_sequences","tensor_type","seed","randomizeSeed","layers","preProcessType","preProcessObject","postProcessType","postProcessObject","optimizer","lossLayer","_lastLayer","_lastOutput","encoder_layer_idx","encoder_layer_name","encoder_layer_var");
		}
		this.mapped[131] = greycat.types_by_name.get(nn.InitializerConfig.name);
		if(this.mapped[131] != null){
			this.mapped[131].resolveGeneratedOffsets("weight_initializer","weight_regularizer","bias_initializer","bias_regularizer");
		}
		this.mapped[132] = greycat.types_by_name.get(nn.ComputeInitializers.name);
		if(this.mapped[132] != null){
			this.mapped[132].resolveGeneratedOffsetWithValues("none", "None","constant", "Constant","sigmoid_uniform", "SigmoidUniform","lecun_uniform", "LeCunUniform","xavier", "Xavier","xavier_uniform", "XavierUniform","relu", "Relu","relu_uniform", "ReluUniform","normal", "Normal","normal_in", "NormalIn","normal_out", "NormalOut","normal_avg", "NormalAvg","uniform", "Uniform","uniform_in", "UniformIn","uniform_out", "UniformOut","uniform_avg", "UniformAvg","identity", "Identity","pytorch", "Pytorch");
		}
		this.mapped[133] = greycat.types_by_name.get(nn.ComputeOptimizers.name);
		if(this.mapped[133] != null){
			this.mapped[133].resolveGeneratedOffsetWithValues("ada_delta", "Ada Delta","ada_grad", "Ada Grad","adam", "Adam","ada_max", "Ada Max","nadam", "NAdam","ftrl", "Ftrl","sgd", "Stochastic Gradient Descent","rms_prop", "RMS Prop","momentum", "Momentum","nesterov", "Nesterov");
		}
		this.mapped[134] = greycat.types_by_name.get(nn.NeuralNetwork.name);
		if(this.mapped[134] != null){
			this.mapped[134].resolveGeneratedOffsets("inputs","inputs_gradients","outputs","fixed_batch_size","inputs_sequences","outputs_sequences","tensor_type","seed","randomizeSeed","layers","preProcessType","preProcessObject","postProcessType","postProcessObject","optimizer","lossLayer","_lastLayer","_lastOutput");
		}
		if(this.mapped[134] != null){
			this.mapped[134].static_values = new java.lang.Object[]{"Inputs or outputs can't be negative","Last layer has different number of outputs than declared","Incompatible loss function","Some NN layers are not currently supported","Tensor Type not currently supported","NN should contain at least 1 layer","layer placeholders","layer classification","layer preprocess","layer postprocess learn","layer main","layer loss learn","layer loss display","layer postprocess display","layer confusion","seq predict","seq postprocess","seq learn","seq loss display","seq encode","seq decode","seq confusion","var input","var enc input","var targets","var Classifier classes","var Classifier probabilities","var Classifier class weights","var Classifier confusion","var input avg","var input min","var input max","var input std","var input space","var output avg","var output min","var output max","var output std"};
		}
		this.mapped[135] = greycat.types_by_name.get(nn.ComputeLayerTypes.name);
		if(this.mapped[135] != null){
			this.mapped[135].resolveGeneratedOffsetWithValues("linear", "Linear","dense", "Dense","activation", "Activation","lstm", "LSTM","loss", "Loss","filter", "Filter");
		}
		this.mapped[136] = greycat.types_by_name.get(nn.ClassificationNetwork.name);
		if(this.mapped[136] != null){
			this.mapped[136].resolveGeneratedOffsets("inputs","inputs_gradients","outputs","fixed_batch_size","inputs_sequences","outputs_sequences","tensor_type","seed","randomizeSeed","layers","preProcessType","preProcessObject","postProcessType","postProcessObject","optimizer","lossLayer","_lastLayer","_lastOutput","calculate_probabilities","has_class_weights","from_logits");
		}
		this.mapped[137] = greycat.types_by_name.get(nn.RegressionNetwork.name);
		if(this.mapped[137] != null){
			this.mapped[137].resolveGeneratedOffsets("inputs","inputs_gradients","outputs","fixed_batch_size","inputs_sequences","outputs_sequences","tensor_type","seed","randomizeSeed","layers","preProcessType","preProcessObject","postProcessType","postProcessObject","optimizer","lossLayer","_lastLayer","_lastOutput");
		}
		this.mapped[138] = greycat.types_by_name.get(nn.ClassificationMetrics.name);
		if(this.mapped[138] != null){
			this.mapped[138].resolveGeneratedOffsets("precision","recall","f1Score");
		}
		this.mapped[139] = greycat.types_by_name.get(nn.ComputeActivations.name);
		if(this.mapped[139] != null){
			this.mapped[139].resolveGeneratedOffsetWithValues("relu", "Relu","leaky_relu", "Leaky Relu","sigmoid", "Sigmoid","hard_sigmoid", "Hard Sigmoid","exp", "Exp","soft_max", "Soft Max","soft_plus", "Soft Plus","soft_sign", "Soft Sign","tanh", "Tanh","selu", "Selu","elu", "Elu","celu", "Celu");
		}
		this.mapped[140] = greycat.types_by_name.get(nn.PostProcessType.name);
		if(this.mapped[140] != null){
			this.mapped[140].resolveGeneratedOffsetWithValues("none", "None","min_max_scaling", "Min/Max Scaling","standard_scaling", "Standard Scaling");
		}
		this.mapped[141] = greycat.types_by_name.get(nn.BindingsResult.name);
		if(this.mapped[141] != null){
			this.mapped[141].resolveGeneratedOffsets("previousLayerName","previousLayerOutput","expectedLayerName","expectedLayerOutput","postLayer");
		}
		this.mapped[142] = greycat.types_by_name.get(nn.PreProcessType.name);
		if(this.mapped[142] != null){
			this.mapped[142].resolveGeneratedOffsetWithValues("none", "None","min_max_scaling", "Min/Max Scaling","standard_scaling", "Standard Scaling","pca_scaling", "PCA Scaling");
		}
		this.mapped[143] = greycat.types_by_name.get(kmeans.KmeanResult.name);
		if(this.mapped[143] != null){
			this.mapped[143].resolveGeneratedOffsets("loss","roundsDistances","centroids","clusters_count","clusters_sum_distance","clusters_avg_distance","assignement","distances","clusterInterDistances");
		}
		this.mapped[144] = greycat.types_by_name.get(kmeans.KmeanMetaResult.name);
		if(this.mapped[144] != null){
			this.mapped[144].resolveGeneratedOffsets("runDistances","bestResult");
		}
		this.mapped[145] = greycat.types_by_name.get(kmeans.Kmeans.name);
		if(this.mapped[145] != null){
			this.mapped[145].static_values = new java.lang.Object[]{"input","assignement","min_distance","centroids","distance","sum_centroids","sum_min_distance","count_centroids","centroid_distances","sum_cluster_distances","avg_cluster_distances","count_cluster_distances","placeholders","kmeans_forward","kmeans_backward","kmeans_init_round","kmeans_end_round","kmeans_stats_layer","kmeans_init_round_seq","kmeans_forward_seq","kmeans_backward_seq","kmeans_end_round_seq","kmeans_stats_seq",100L,20L};
		}
		this.mapped[146] = greycat.types_by_name.get(patterns.DTWPatternDetector.name);
		this.mapped[147] = greycat.types_by_name.get(patterns.ScoreDetailsSingleton.name);
		if(this.mapped[147] != null){
			this.mapped[147].resolveGeneratedOffsets("best_pattern","timespan","timestamp");
		}
		this.mapped[148] = greycat.types_by_name.get(patterns.PatternDetector.name);
		this.mapped[149] = greycat.types_by_name.get(patterns.PatternDetectionEngine.name);
		if(this.mapped[149] != null){
			this.mapped[149].resolveGeneratedOffsets("timeseries","state","nullStrategy","nullReplaceConstant","samplingPolicy");
		}
		this.mapped[150] = greycat.types_by_name.get(patterns.PatternDetectionSensitivity.name);
		if(this.mapped[150] != null){
			this.mapped[150].resolveGeneratedOffsets("threshold","overlap");
		}
		this.mapped[151] = greycat.types_by_name.get(patterns.SaxPatternDetectionEngine.name);
		if(this.mapped[151] != null){
			this.mapped[151].resolveGeneratedOffsets("timeseries","state","nullStrategy","nullReplaceConstant","samplingPolicy","alphabet_size","alphabet_boundaries","lookup_table","max_distance","pattern_fingerprints","fingerprint_length");
		}
		if(this.mapped[151] != null){
			this.mapped[151].static_values = new java.lang.Object[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz"};
		}
		this.mapped[152] = greycat.types_by_name.get(patterns.SamplingPolicy.name);
		if(this.mapped[152] != null){
			this.mapped[152].resolveGeneratedOffsetWithValues("as_is", "As-is","average_frequency", "Average frequency","highest_frequency", "Highest frequency");
		}
		this.mapped[153] = greycat.types_by_name.get(patterns.DTWPatternDetectionEngine.name);
		if(this.mapped[153] != null){
			this.mapped[153].resolveGeneratedOffsets("timeseries","state","nullStrategy","nullReplaceConstant","samplingPolicy","std","matchingNormalisation");
		}
		this.mapped[154] = greycat.types_by_name.get(patterns.PatternDetectionEngineState.name);
		if(this.mapped[154] != null){
			this.mapped[154].resolveGeneratedOffsets("hasScores","hasDetections","patterns","scores","detections");
		}
		this.mapped[155] = greycat.types_by_name.get(patterns.RandomPatternDetector.name);
		this.mapped[156] = greycat.types_by_name.get(patterns.FFTPatternDetector.name);
		this.mapped[157] = greycat.types_by_name.get(patterns.ScoreDetails.name);
		if(this.mapped[157] != null){
			this.mapped[157].resolveGeneratedOffsets("best_pattern","timespan");
		}
		this.mapped[158] = greycat.types_by_name.get(patterns.Detection.name);
		if(this.mapped[158] != null){
			this.mapped[158].resolveGeneratedOffsets("score","best_pattern","timespan");
		}
		this.mapped[159] = greycat.types_by_name.get(patterns.EuclideanPatternDetectionEngine.name);
		if(this.mapped[159] != null){
			this.mapped[159].resolveGeneratedOffsets("timeseries","state","nullStrategy","nullReplaceConstant","samplingPolicy","pattern_tensors","window_tensors","std","matchingNormalisation");
		}
		this.mapped[160] = greycat.types_by_name.get(patterns.RandomPatternDetectionEngine.name);
		if(this.mapped[160] != null){
			this.mapped[160].resolveGeneratedOffsets("timeseries","state","nullStrategy","nullReplaceConstant","samplingPolicy","rng");
		}
		this.mapped[161] = greycat.types_by_name.get(patterns.PatternNullStrategy.name);
		if(this.mapped[161] != null){
			this.mapped[161].resolveGeneratedOffsetWithValues("replace", "Replace","interpolate", "Interpolate","previous", "Previous","next", "Next","none", "None");
		}
		this.mapped[162] = greycat.types_by_name.get(patterns.PatternDetectors.name);
		if(this.mapped[162] != null){
			this.mapped[162].resolveGeneratedOffsetWithValues("none", "None","euclidean", "Euclidean","fft", "FFT","dtw", "DTW","random", "Random","sax", "SAX");
		}
		this.mapped[163] = greycat.types_by_name.get(patterns.MatchingNormalisation.name);
		if(this.mapped[163] != null){
			this.mapped[163].resolveGeneratedOffsetWithValues("as_is", "As-is","shift", "Vertical shift","scaling", "Vertical scaling","shift_and_scaling", "Vertical shift and scaling");
		}
		this.mapped[164] = greycat.types_by_name.get(patterns.DistanceMetrics.name);
		this.mapped[165] = greycat.types_by_name.get(patterns.EuclideanPatternDetector.name);
		this.mapped[166] = greycat.types_by_name.get(patterns.FFTResult.name);
		if(this.mapped[166] != null){
			this.mapped[166].resolveGeneratedOffsets("distance","best_pattern","best_timespan");
		}
		this.mapped[167] = greycat.types_by_name.get(patterns.OverlappingDetection.name);
		if(this.mapped[167] != null){
			this.mapped[167].resolveGeneratedOffsets("score","best_pattern","timespan","overlap");
		}
		this.mapped[168] = greycat.types_by_name.get(patterns.SaxPatternDetector.name);
		if(this.mapped[168] != null){
			this.mapped[168].resolveGeneratedOffsets("alphabet_size","fingerprint_length");
		}
		this.mapped[169] = greycat.types_by_name.get(ml.TimeSeriesDecomposition.name);
		this.mapped[170] = greycat.types_by_name.get(ml.PCA.name);
		if(this.mapped[170] != null){
			this.mapped[170].static_values = new java.lang.Object[]{java.lang.Double.longBitsToDouble(4606732058837280358L)};
		}
		this.mapped[171] = greycat.types_by_name.get(ml.GaussianND.name);
		this.mapped[172] = greycat.types_by_name.get(ml.HeatMapProfile.name);
		if(this.mapped[172] != null){
			this.mapped[172].resolveGeneratedOffsets("counts","x_labels","y_labels","counts_max","counts_sum");
		}
		this.mapped[173] = greycat.types_by_name.get(ml.Polynomial.name);
		this.mapped[174] = greycat.types_by_name.get(ml.Solver.name);
		this.mapped[175] = greycat.types_by_name.get(transforms.FFTModel.name);
		if(this.mapped[175] != null){
			this.mapped[175].resolveGeneratedOffsets("nt","sampling_step","time_complex","frequency_complex","frequency_table","start_time","best_size");
		}
		this.mapped[176] = greycat.types_by_name.get(powerflow.PowerBusResult.name);
		if(this.mapped[176] != null){
			this.mapped[176].resolveGeneratedOffsets("abs","angle_radians","voltage","voltage_img","current","current_img");
		}
		this.mapped[177] = greycat.types_by_name.get(powerflow.PowerLineResult.name);
		if(this.mapped[177] != null){
			this.mapped[177].resolveGeneratedOffsets("p_from_mw","q_from_mvar","p_to_mw","q_to_mvar","pl_mw","ql_mvar","i_from_ka","i_to_ka","i_ka","vm_from_pu","vm_to_pu","va_from_radians","va_to_radians","loading_percent");
		}
	}
}
