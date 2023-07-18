// AUTO-GENERATED FILE PLEASE DO NOT MODIFY MANUALLY
package ai.greycat;
@SuppressWarnings({"unused", "unchecked"})
public final class patterns extends ai.greycat.GreyCat.Library {
	public static final java.lang.String name = "patterns";
	@Override
	public String name() {
		return name;
	}
	public static final class pattern_detectors {
		public static final class RandomPatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.RandomPatternDetector";
			private RandomPatternDetector(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static RandomPatternDetector create(ai.greycat.GreyCat greycat){
				return new RandomPatternDetector(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[0]);
			}
		}
		public static final class PatternDetectionEngineState extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.PatternDetectionEngineState";
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
				return new PatternDetectionEngineState(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[1], hasScores, hasDetections, patterns, scores, detections);
			}
		}
		public static final class ScoreDetails extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.ScoreDetails";
			private ScoreDetails(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long best_pattern(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_best_pattern(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std_n.core.duration timespan(){
				return (ai.greycat.std_n.core.duration)super.get(super.type.generated_offsets[1]);
			}
			public void set_timespan(ai.greycat.std_n.core.duration v){
				super.set(super.type.generated_offsets[1],v);
			}
			public static ScoreDetails create(ai.greycat.GreyCat greycat, java.lang.Long best_pattern, ai.greycat.std_n.core.duration timespan){
				return new ScoreDetails(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[2], best_pattern, timespan);
			}
		}
		public static final class EuclideanPatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.EuclideanPatternDetector";
			private EuclideanPatternDetector(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static EuclideanPatternDetector create(ai.greycat.GreyCat greycat){
				return new EuclideanPatternDetector(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[3]);
			}
		}
		public static final class SaxPatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.SaxPatternDetector";
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
				return new SaxPatternDetector(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[4], alphabet_size, fingerprint_length);
			}
		}
		public static final class PatternDetectionEngine extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.PatternDetectionEngine";
			private PatternDetectionEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime timeseries(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_timeseries(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState state(){
				return (ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState)super.get(super.type.generated_offsets[1]);
			}
			public void set_state(ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.patterns.pattern_detectors.PatternNullStrategy nullStrategy(){
				return (ai.greycat.patterns.pattern_detectors.PatternNullStrategy)super.get(super.type.generated_offsets[2]);
			}
			public void set_nullStrategy(ai.greycat.patterns.pattern_detectors.PatternNullStrategy v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double nullReplaceConstant(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_nullReplaceConstant(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static PatternDetectionEngine create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime timeseries, ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState state, ai.greycat.patterns.pattern_detectors.PatternNullStrategy nullStrategy, java.lang.Double nullReplaceConstant){
				return new PatternDetectionEngine(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[5], timeseries, state, nullStrategy, nullReplaceConstant);
			}
		}
		public static final class PatternDetector extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.PatternDetector";
			private PatternDetector(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static PatternDetector create(ai.greycat.GreyCat greycat){
				return new PatternDetector(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[6]);
			}
		}
		public static final class PatternNullStrategy extends GreyCat.Enum {
			public static final java.lang.String name = "pattern_detectors.PatternNullStrategy";
			private PatternNullStrategy(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.patterns.pattern_detectors.PatternNullStrategy replace(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[7];
				return (ai.greycat.patterns.pattern_detectors.PatternNullStrategy) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.patterns.pattern_detectors.PatternNullStrategy interpolate(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[7];
				return (ai.greycat.patterns.pattern_detectors.PatternNullStrategy) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.patterns.pattern_detectors.PatternNullStrategy previous(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[7];
				return (ai.greycat.patterns.pattern_detectors.PatternNullStrategy) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.patterns.pattern_detectors.PatternNullStrategy next(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[7];
				return (ai.greycat.patterns.pattern_detectors.PatternNullStrategy) t.enum_values[t.generated_offsets[3]];
			}
			public static ai.greycat.patterns.pattern_detectors.PatternNullStrategy none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[7];
				return (ai.greycat.patterns.pattern_detectors.PatternNullStrategy) t.enum_values[t.generated_offsets[4]];
			}
			public static PatternNullStrategy create(ai.greycat.GreyCat greycat){
				return new PatternNullStrategy(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[7]);
			}
		}
		public static final class Detection extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.Detection";
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
			public ai.greycat.std_n.core.duration timespan(){
				return (ai.greycat.std_n.core.duration)super.get(super.type.generated_offsets[2]);
			}
			public void set_timespan(ai.greycat.std_n.core.duration v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static Detection create(ai.greycat.GreyCat greycat, java.lang.Double score, java.lang.Long best_pattern, ai.greycat.std_n.core.duration timespan){
				return new Detection(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[8], score, best_pattern, timespan);
			}
		}
		public static final class PatternDetectionSensitivity extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.PatternDetectionSensitivity";
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
				return new PatternDetectionSensitivity(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[9], threshold, overlap);
			}
		}
		public static final class EuclideanPatternDetectionEngine extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.EuclideanPatternDetectionEngine";
			private EuclideanPatternDetectionEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime timeseries(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_timeseries(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState state(){
				return (ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState)super.get(super.type.generated_offsets[1]);
			}
			public void set_state(ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.patterns.pattern_detectors.PatternNullStrategy nullStrategy(){
				return (ai.greycat.patterns.pattern_detectors.PatternNullStrategy)super.get(super.type.generated_offsets[2]);
			}
			public void set_nullStrategy(ai.greycat.patterns.pattern_detectors.PatternNullStrategy v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double nullReplaceConstant(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_nullReplaceConstant(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Double std(){
				return (java.lang.Double)super.get(super.type.generated_offsets[4]);
			}
			public void set_std(java.lang.Double v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static EuclideanPatternDetectionEngine create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime timeseries, ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState state, ai.greycat.patterns.pattern_detectors.PatternNullStrategy nullStrategy, java.lang.Double nullReplaceConstant, java.lang.Double std){
				return new EuclideanPatternDetectionEngine(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[10], timeseries, state, nullStrategy, nullReplaceConstant, std);
			}
		}
		public static final class SaxPatternDetectionEngine extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.SaxPatternDetectionEngine";
			private SaxPatternDetectionEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime timeseries(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_timeseries(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState state(){
				return (ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState)super.get(super.type.generated_offsets[1]);
			}
			public void set_state(ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.patterns.pattern_detectors.PatternNullStrategy nullStrategy(){
				return (ai.greycat.patterns.pattern_detectors.PatternNullStrategy)super.get(super.type.generated_offsets[2]);
			}
			public void set_nullStrategy(ai.greycat.patterns.pattern_detectors.PatternNullStrategy v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double nullReplaceConstant(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_nullReplaceConstant(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public java.lang.Long alphabet_size(){
				return (java.lang.Long)super.get(super.type.generated_offsets[4]);
			}
			public void set_alphabet_size(java.lang.Long v){
				super.set(super.type.generated_offsets[4],v);
			}
			public ai.greycat.std.core.Array<java.lang.Double> alphabet_boundaries(){
				return (ai.greycat.std.core.Array<java.lang.Double>)super.get(super.type.generated_offsets[5]);
			}
			public void set_alphabet_boundaries(ai.greycat.std.core.Array<java.lang.Double> v){
				super.set(super.type.generated_offsets[5],v);
			}
			public ai.greycat.std.core.nodeIndex lookup_table(){
				return (ai.greycat.std.core.nodeIndex)super.get(super.type.generated_offsets[6]);
			}
			public void set_lookup_table(ai.greycat.std.core.nodeIndex v){
				super.set(super.type.generated_offsets[6],v);
			}
			public java.lang.Double max_distance(){
				return (java.lang.Double)super.get(super.type.generated_offsets[7]);
			}
			public void set_max_distance(java.lang.Double v){
				super.set(super.type.generated_offsets[7],v);
			}
			public ai.greycat.std.core.Array<java.lang.String> pattern_fingerprints(){
				return (ai.greycat.std.core.Array<java.lang.String>)super.get(super.type.generated_offsets[8]);
			}
			public void set_pattern_fingerprints(ai.greycat.std.core.Array<java.lang.String> v){
				super.set(super.type.generated_offsets[8],v);
			}
			public java.lang.Long fingerprint_length(){
				return (java.lang.Long)super.get(super.type.generated_offsets[9]);
			}
			public void set_fingerprint_length(java.lang.Long v){
				super.set(super.type.generated_offsets[9],v);
			}
			public static java.lang.String alphabet(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[11];
				return (java.lang.String) t.static_values[0];
			}
			public static SaxPatternDetectionEngine create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime timeseries, ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState state, ai.greycat.patterns.pattern_detectors.PatternNullStrategy nullStrategy, java.lang.Double nullReplaceConstant, java.lang.Long alphabet_size, ai.greycat.std.core.Array<java.lang.Double> alphabet_boundaries, ai.greycat.std.core.nodeIndex lookup_table, java.lang.Double max_distance, ai.greycat.std.core.Array<java.lang.String> pattern_fingerprints, java.lang.Long fingerprint_length){
				return new SaxPatternDetectionEngine(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[11], timeseries, state, nullStrategy, nullReplaceConstant, alphabet_size, alphabet_boundaries, lookup_table, max_distance, pattern_fingerprints, fingerprint_length);
			}
		}
		public static final class PatternDetectors extends GreyCat.Enum {
			public static final java.lang.String name = "pattern_detectors.PatternDetectors";
			private PatternDetectors(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public static ai.greycat.patterns.pattern_detectors.PatternDetectors none(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[12];
				return (ai.greycat.patterns.pattern_detectors.PatternDetectors) t.enum_values[t.generated_offsets[0]];
			}
			public static ai.greycat.patterns.pattern_detectors.PatternDetectors euclidean(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[12];
				return (ai.greycat.patterns.pattern_detectors.PatternDetectors) t.enum_values[t.generated_offsets[1]];
			}
			public static ai.greycat.patterns.pattern_detectors.PatternDetectors random(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[12];
				return (ai.greycat.patterns.pattern_detectors.PatternDetectors) t.enum_values[t.generated_offsets[2]];
			}
			public static ai.greycat.patterns.pattern_detectors.PatternDetectors sax(ai.greycat.GreyCat greycat){
				final ai.greycat.GreyCat.Type t = greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[12];
				return (ai.greycat.patterns.pattern_detectors.PatternDetectors) t.enum_values[t.generated_offsets[3]];
			}
			public static PatternDetectors create(ai.greycat.GreyCat greycat){
				return new PatternDetectors(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[12]);
			}
		}
		public static final class RandomPatternDetectionEngine extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.RandomPatternDetectionEngine";
			private RandomPatternDetectionEngine(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public ai.greycat.std.core.nodeTime timeseries(){
				return (ai.greycat.std.core.nodeTime)super.get(super.type.generated_offsets[0]);
			}
			public void set_timeseries(ai.greycat.std.core.nodeTime v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState state(){
				return (ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState)super.get(super.type.generated_offsets[1]);
			}
			public void set_state(ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.patterns.pattern_detectors.PatternNullStrategy nullStrategy(){
				return (ai.greycat.patterns.pattern_detectors.PatternNullStrategy)super.get(super.type.generated_offsets[2]);
			}
			public void set_nullStrategy(ai.greycat.patterns.pattern_detectors.PatternNullStrategy v){
				super.set(super.type.generated_offsets[2],v);
			}
			public java.lang.Double nullReplaceConstant(){
				return (java.lang.Double)super.get(super.type.generated_offsets[3]);
			}
			public void set_nullReplaceConstant(java.lang.Double v){
				super.set(super.type.generated_offsets[3],v);
			}
			public ai.greycat.std.util.Random rng(){
				return (ai.greycat.std.util.Random)super.get(super.type.generated_offsets[4]);
			}
			public void set_rng(ai.greycat.std.util.Random v){
				super.set(super.type.generated_offsets[4],v);
			}
			public static RandomPatternDetectionEngine create(ai.greycat.GreyCat greycat, ai.greycat.std.core.nodeTime timeseries, ai.greycat.patterns.pattern_detectors.PatternDetectionEngineState state, ai.greycat.patterns.pattern_detectors.PatternNullStrategy nullStrategy, java.lang.Double nullReplaceConstant, ai.greycat.std.util.Random rng){
				return new RandomPatternDetectionEngine(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[13], timeseries, state, nullStrategy, nullReplaceConstant, rng);
			}
		}
		public static final class ScoreDetailsSingleton extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.ScoreDetailsSingleton";
			private ScoreDetailsSingleton(ai.greycat.GreyCat.Type type, java.lang.Object... attributes) {
				super(type, attributes);
			}
			public java.lang.Long best_pattern(){
				return (java.lang.Long)super.get(super.type.generated_offsets[0]);
			}
			public void set_best_pattern(java.lang.Long v){
				super.set(super.type.generated_offsets[0],v);
			}
			public ai.greycat.std_n.core.duration timespan(){
				return (ai.greycat.std_n.core.duration)super.get(super.type.generated_offsets[1]);
			}
			public void set_timespan(ai.greycat.std_n.core.duration v){
				super.set(super.type.generated_offsets[1],v);
			}
			public ai.greycat.std_n.core.time timestamp(){
				return (ai.greycat.std_n.core.time)super.get(super.type.generated_offsets[2]);
			}
			public void set_timestamp(ai.greycat.std_n.core.time v){
				super.set(super.type.generated_offsets[2],v);
			}
			public static ScoreDetailsSingleton create(ai.greycat.GreyCat greycat, java.lang.Long best_pattern, ai.greycat.std_n.core.duration timespan, ai.greycat.std_n.core.time timestamp){
				return new ScoreDetailsSingleton(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[14], best_pattern, timespan, timestamp);
			}
		}
		public static final class OverlappingDetection extends GreyCat.Object {
			public static final java.lang.String name = "pattern_detectors.OverlappingDetection";
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
			public ai.greycat.std_n.core.duration timespan(){
				return (ai.greycat.std_n.core.duration)super.get(super.type.generated_offsets[2]);
			}
			public void set_timespan(ai.greycat.std_n.core.duration v){
				super.set(super.type.generated_offsets[2],v);
			}
			public ai.greycat.std_n.core.duration overlap(){
				return (ai.greycat.std_n.core.duration)super.get(super.type.generated_offsets[3]);
			}
			public void set_overlap(ai.greycat.std_n.core.duration v){
				super.set(super.type.generated_offsets[3],v);
			}
			public static OverlappingDetection create(ai.greycat.GreyCat greycat, java.lang.Double score, java.lang.Long best_pattern, ai.greycat.std_n.core.duration timespan, ai.greycat.std_n.core.duration overlap){
				return new OverlappingDetection(greycat.libs_by_name.get(ai.greycat.patterns.name).mapped[15], score, best_pattern, timespan, overlap);
			}
		}
	}
	@Override
	public void configure(java.util.Map<String, ai.greycat.GreyCat.Loader> loaders, java.util.Map<String, ai.greycat.GreyCat.Factory> factories) {
		factories.put(pattern_detectors.RandomPatternDetector.name, pattern_detectors.RandomPatternDetector::new);
		factories.put(pattern_detectors.PatternDetectionEngineState.name, pattern_detectors.PatternDetectionEngineState::new);
		factories.put(pattern_detectors.ScoreDetails.name, pattern_detectors.ScoreDetails::new);
		factories.put(pattern_detectors.EuclideanPatternDetector.name, pattern_detectors.EuclideanPatternDetector::new);
		factories.put(pattern_detectors.SaxPatternDetector.name, pattern_detectors.SaxPatternDetector::new);
		factories.put(pattern_detectors.PatternDetectionEngine.name, pattern_detectors.PatternDetectionEngine::new);
		factories.put(pattern_detectors.PatternDetector.name, pattern_detectors.PatternDetector::new);
		factories.put(pattern_detectors.PatternNullStrategy.name, pattern_detectors.PatternNullStrategy::new);
		factories.put(pattern_detectors.Detection.name, pattern_detectors.Detection::new);
		factories.put(pattern_detectors.PatternDetectionSensitivity.name, pattern_detectors.PatternDetectionSensitivity::new);
		factories.put(pattern_detectors.EuclideanPatternDetectionEngine.name, pattern_detectors.EuclideanPatternDetectionEngine::new);
		factories.put(pattern_detectors.SaxPatternDetectionEngine.name, pattern_detectors.SaxPatternDetectionEngine::new);
		factories.put(pattern_detectors.PatternDetectors.name, pattern_detectors.PatternDetectors::new);
		factories.put(pattern_detectors.RandomPatternDetectionEngine.name, pattern_detectors.RandomPatternDetectionEngine::new);
		factories.put(pattern_detectors.ScoreDetailsSingleton.name, pattern_detectors.ScoreDetailsSingleton::new);
		factories.put(pattern_detectors.OverlappingDetection.name, pattern_detectors.OverlappingDetection::new);
	}
	@Override
	public void init(ai.greycat.GreyCat greycat) {
		this.mapped = new ai.greycat.GreyCat.Type[16];
		this.mapped[0] = greycat.types_by_name.get(pattern_detectors.RandomPatternDetector.name);
		this.mapped[1] = greycat.types_by_name.get(pattern_detectors.PatternDetectionEngineState.name);
		this.mapped[1].resolveGeneratedOffsets("hasScores","hasDetections","patterns","scores","detections");
		this.mapped[2] = greycat.types_by_name.get(pattern_detectors.ScoreDetails.name);
		this.mapped[2].resolveGeneratedOffsets("best_pattern","timespan");
		this.mapped[3] = greycat.types_by_name.get(pattern_detectors.EuclideanPatternDetector.name);
		this.mapped[4] = greycat.types_by_name.get(pattern_detectors.SaxPatternDetector.name);
		this.mapped[4].resolveGeneratedOffsets("alphabet_size","fingerprint_length");
		this.mapped[5] = greycat.types_by_name.get(pattern_detectors.PatternDetectionEngine.name);
		this.mapped[5].resolveGeneratedOffsets("timeseries","state","nullStrategy","nullReplaceConstant");
		this.mapped[6] = greycat.types_by_name.get(pattern_detectors.PatternDetector.name);
		this.mapped[7] = greycat.types_by_name.get(pattern_detectors.PatternNullStrategy.name);
		this.mapped[7].resolveGeneratedOffsetWithValues("replace", "Replace","interpolate", "Interpolate","previous", "Previous","next", "Next","none", "None");
		this.mapped[8] = greycat.types_by_name.get(pattern_detectors.Detection.name);
		this.mapped[8].resolveGeneratedOffsets("score","best_pattern","timespan");
		this.mapped[9] = greycat.types_by_name.get(pattern_detectors.PatternDetectionSensitivity.name);
		this.mapped[9].resolveGeneratedOffsets("threshold","overlap");
		this.mapped[10] = greycat.types_by_name.get(pattern_detectors.EuclideanPatternDetectionEngine.name);
		this.mapped[10].resolveGeneratedOffsets("timeseries","state","nullStrategy","nullReplaceConstant","std");
		this.mapped[11] = greycat.types_by_name.get(pattern_detectors.SaxPatternDetectionEngine.name);
		this.mapped[11].resolveGeneratedOffsets("timeseries","state","nullStrategy","nullReplaceConstant","alphabet_size","alphabet_boundaries","lookup_table","max_distance","pattern_fingerprints","fingerprint_length");
		this.mapped[11].static_values = new java.lang.Object[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz"};
		this.mapped[12] = greycat.types_by_name.get(pattern_detectors.PatternDetectors.name);
		this.mapped[12].resolveGeneratedOffsetWithValues("none", "None","euclidean", "Euclidean","random", "Random","sax", "SAX");
		this.mapped[13] = greycat.types_by_name.get(pattern_detectors.RandomPatternDetectionEngine.name);
		this.mapped[13].resolveGeneratedOffsets("timeseries","state","nullStrategy","nullReplaceConstant","rng");
		this.mapped[14] = greycat.types_by_name.get(pattern_detectors.ScoreDetailsSingleton.name);
		this.mapped[14].resolveGeneratedOffsets("best_pattern","timespan","timestamp");
		this.mapped[15] = greycat.types_by_name.get(pattern_detectors.OverlappingDetection.name);
		this.mapped[15].resolveGeneratedOffsets("score","best_pattern","timespan","overlap");
	}
}
