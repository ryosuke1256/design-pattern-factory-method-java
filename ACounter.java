abstract class ACounter {
    // factory method
    abstract ISupporter inquire();

    // 共通処理
    protected void explain() {
        ISupporter supporter = inquire();
        // 動的（インスタンス毎）に処理を変える
        supporter.explain();
    }
}
