package client_lib;

public class Credit extends BankService {
    private double contrib;

    public Credit() {
        super();
    }

    public Credit(int Years) {
        super(Years);
    }

    public Credit(double Body) {
        super(Body);
    }

    public Credit(int Years, double Percent, double Body, double contrib) {
        super(Years, Percent, Body);
        this.contrib = contrib;
    }

    public void setContrib(double newContrib) {
        contrib = newContrib;
    }

    public double getContrib() {
        return this.contrib;
    }

    public double getFinalContributionsPayments() {
        double FinalContributionsPayments = 0;
        int years = getYears();
        double body = getBody();
        double percent = getPercent();
        double contribution = getContrib();
        for (int i = 0; i < years; i++) {
            if (body < contribution) {
                FinalContributionsPayments += body;
                body = 0;
            } else {
                FinalContributionsPayments += contribution;
                body -= contribution;
                body *= percent;
            }
        }
        return FinalContributionsPayments;
    }

    public void showInConsole() {
        String Info = "Credit year: " + Integer.toString(this.getYears()) + " body: " + Double.toString(this.getBody())
                + " percent: " + Double.toString(this.getPercent()) + " contribution: "
                + Double.toString(this.getContrib());
        System.out.println(Info);
    }

    public boolean checkThisCredit() {
        if (!(this.getYears() > 0 && this.getBody() > this.getContrib() && this.getPercent() > 1))
            return false;
        if (this.getBody() * (this.getPercent() - 1) >= this.getContrib())
            return false;

        int trueYears = 0;
        double Body = this.getBody();
        for (trueYears = 0; Body > 0; trueYears++)
            Body -= Body * this.getPercent();
        if (trueYears != this.getYears())
            return false;

        return true;
    }

    public static boolean checkCredit(Credit credit) {
        if (!(credit.getYears() > 0 && credit.getBody() > credit.getContrib() && credit.getPercent() > 1))
            return false;
        if (credit.getBody() * (credit.getPercent() - 1) >= credit.getContrib())
            return false;

        int trueYears = 0;
        double Body = credit.getBody();
        for (trueYears = 0; Body > 0; trueYears++)
            Body -= Body * credit.getPercent();
        if (trueYears != credit.getYears())
            return false;

        return true;
    }

    public static boolean checkCredit(int years, double body, double percent, double contribution) {
        if (!(years > 0 && body > contribution && percent > 1))
            return false;
        if (body * (percent - 1) >= contribution)
            return false;

        int trueYears = 0;
        double Body = body;
        for (trueYears = 0; Body > 0; trueYears++)
            Body -= Body * percent;
        if (trueYears != years)
            return false;

        return true;
    }
}