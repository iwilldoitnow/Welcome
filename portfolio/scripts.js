const translations = {
  pl: {
    tagline: "Analityk biznesowy & danych",
    nav: {
      about: "O mnie",
      skills: "Umiejętności",
      certs: "Certyfikaty",
      projects: "Projekty",
      blog: "Blog",
      powerbi: "Power BI",
      contact: "Kontakt"
    },
    hero: {
      eyebrow: "Witaj! Jestem",
      lead:
        "Pomagam firmom podejmować lepsze decyzje dzięki analizie danych, automatyzacji raportowania i projektom business intelligence.",
      primary: "Zobacz projekty",
      secondary: "Pobierz CV",
      metric1: "Doświadczenie w analizie",
      metric2: "Zrealizowane dashboardy",
      metric3: "Certyfikaty",
      metric4: "Branże"
    },
    about: {
      title: "O mnie",
      body:
        "Jestem analitykiem biznesowym z pasją do pracy z danymi. Łączę zrozumienie procesów biznesowych z umiejętnością budowania czytelnych raportów i rekomendacji. Pomagam zespołom podejmować decyzje oparte na danych.",
      body2:
        "Specjalizuję się w analizach strategicznych, automatyzacji raportów oraz współpracy z interesariuszami. Moim celem jest przekładanie liczb na konkretne działania biznesowe.",
      highlightTitle: "Szybki profil",
      highlight1: "Analityka biznesowa & danych",
      highlight2: "Power BI, SQL, Python",
      highlight3: "Lean, Agile, wymagania biznesowe",
      highlight4: "Automatyzacja raportowania"
    },
    skills: {
      title: "Umiejętności",
      card1: { title: "Analiza danych", body: "Modelowanie danych, statystyka biznesowa, analiza trendów." },
      card2: {
        title: "Business Intelligence",
        body: "Power BI, dashboardy KPI, automatyczne raportowanie dla zarządu."
      },
      card3: {
        title: "Procesy & komunikacja",
        body: "Zbieranie wymagań, mapowanie procesów, współpraca z interesariuszami."
      }
    },
    certs: {
      title: "Certyfikaty",
      item1: "Zaawansowana analityka i wizualizacja danych.",
      item2: "Zwinne zarządzanie projektami i zespołami.",
      item3: "Zaawansowane zapytania i optymalizacja baz danych."
    },
    projects: {
      title: "Projekty",
      cta: "Porozmawiajmy o współpracy",
      more: "Więcej",
      p1: {
        title: "Dashboard sprzedażowy 360°",
        body: "Interaktywny raport KPI dla zespołu sprzedaży, automatyczne alerty i segmentacja klientów."
      },
      p2: {
        title: "Optymalizacja kosztów operacyjnych",
        body: "Analiza kosztów w 5 obszarach biznesowych, rekomendacje oszczędności i roadmapa działań."
      },
      p3: {
        title: "Automatyzacja raportowania ESG",
        body: "Integracja danych z wielu źródeł, hurtownia danych i harmonogram raportów ESG."
      }
    },
    blog: {
      title: "Blog",
      frequency: "Nowy wpis co 2 tygodnie",
      read: "Czytaj wpis",
      post1: {
        title: "Jak mierzyć efektywność procesów biznesowych?",
        body: "Poznaj zestaw metryk, które pomagają łączyć dane operacyjne z celami strategicznymi."
      },
      post2: {
        title: "Top 5 błędów w dashboardach zarządczych",
        body: "Najczęstsze problemy w raportach KPI i jak je poprawić, aby decyzje były trafniejsze."
      }
    },
    powerbi: {
      title: "Power BI - przykładowe raporty",
      body:
        "Poniżej znajdziesz interaktywne raporty Power BI publikowane publicznie. W finalnej wersji zostaną podłączone do aktualnych danych i automatycznie odświeżane."
    },
    contact: {
      title: "Kontakt",
      body: "Chcesz porozmawiać o projekcie lub współpracy? Wypełnij formularz lub skontaktuj się bezpośrednio.",
      form: {
        name: "Imię i nazwisko",
        email: "Email",
        topic: "Temat",
        message: "Wiadomość",
        submit: "Wyślij wiadomość",
        note: "Formularz wyśle dane do Google Sheets po podpięciu skryptu Google Apps Script."
      }
    },
    projectPages: {
      back: "Powrót do strony głównej",
      overview: "Opis projektu",
      goals: "Cele i rezultaty",
      tools: "Narzędzia i technologie",
      timeline: "Kluczowe etapy"
    },
    project1: {
      title: "Dashboard sprzedażowy 360°",
      summary:
        "Projekt kompleksowego raportu sprzedażowego wspierającego kadrę zarządzającą i zespoły handlowe.",
      overview:
        "Dashboard agreguje dane z CRM, systemu sprzedażowego oraz narzędzi marketingowych. Zapewnia spójny obraz lejka sprzedaży oraz marż w podziale na segmenty klientów.",
      goals: [
        "Automatyczne alerty o spadku sprzedaży",
        "Segmentacja klientów według wartości",
        "Jedno źródło prawdy dla zarządu"
      ],
      tools: ["Power BI", "SQL Server", "Azure Data Factory", "Excel"],
      timeline: ["Analiza wymagań i warsztaty", "Model danych i prototyp", "Wdrożenie i szkolenia"]
    },
    project2: {
      title: "Optymalizacja kosztów operacyjnych",
      summary:
        "Analiza kosztów operacyjnych w pięciu obszarach działalności wraz z rekomendacjami oszczędności.",
      overview:
        "Projekt skupiał się na identyfikacji kosztów o najwyższym wpływie na wynik finansowy. Zastosowano analizy ABC oraz wariancję budżetową.",
      goals: [
        "Identyfikacja obszarów wysokich kosztów",
        "Rekomendacje działań oszczędnościowych",
        "Monitorowanie efektów w cyklu miesięcznym"
      ],
      tools: ["Python", "Power BI", "SQL", "Miro"],
      timeline: ["Zebranie danych", "Analiza i rekomendacje", "Warsztaty wdrożeniowe"]
    },
    project3: {
      title: "Automatyzacja raportowania ESG",
      summary: "Zautomatyzowany pipeline raportowania ESG dla grupy kapitałowej.",
      overview:
        "Wdrożono proces pozyskiwania danych środowiskowych i społecznych z rozproszonych systemów oraz harmonogram automatycznego raportowania.",
      goals: [
        "Spójność danych ESG w grupie",
        "Redukcja czasu raportowania o 40%",
        "Przygotowanie do audytów"
      ],
      tools: ["Power BI", "Power Automate", "SQL", "SharePoint"],
      timeline: ["Mapowanie źródeł danych", "Automatyzacja ETL", "Szkolenia dla zespołów"]
    },
    blogPages: {
      back: "Powrót do strony głównej",
      readTime: "Czas czytania: 5 min",
      tag: "Analityka biznesowa"
    },
    blog1: {
      title: "Jak mierzyć efektywność procesów biznesowych?",
      intro:
        "Efektywność procesów to nie tylko czas realizacji. To również jakość, koszt oraz wpływ na klienta.",
      points: [
        "Zdefiniuj metryki na poziomie celu biznesowego.",
        "Łącz dane operacyjne z feedbackiem klienta.",
        "Buduj raporty, które pokazują przyczynę, nie tylko skutek."
      ]
    },
    blog2: {
      title: "Top 5 błędów w dashboardach zarządczych",
      intro:
        "Dashboardy zarządcze powinny być czytelne i oparte o kluczowe decyzje. Oto najczęstsze błędy.",
      points: [
        "Zbyt wiele metryk w jednym widoku.",
        "Brak kontekstu i benchmarków.",
        "Nieaktualne dane bez harmonogramu odświeżania."
      ]
    }
  },
  en: {
    tagline: "Business & Data Analyst",
    nav: {
      about: "About",
      skills: "Skills",
      certs: "Certificates",
      projects: "Projects",
      blog: "Blog",
      powerbi: "Power BI",
      contact: "Contact"
    },
    hero: {
      eyebrow: "Hello! I am",
      lead:
        "I help organizations make better decisions through data analysis, automated reporting, and business intelligence projects.",
      primary: "View projects",
      secondary: "Download CV",
      metric1: "Analytics experience",
      metric2: "Dashboards delivered",
      metric3: "Certificates",
      metric4: "Industries"
    },
    about: {
      title: "About me",
      body:
        "I am a business analyst with a passion for data. I combine process understanding with the ability to build clear reports and actionable recommendations. I help teams make data-driven decisions.",
      body2:
        "I specialize in strategic analysis, reporting automation, and stakeholder collaboration. My goal is to translate numbers into concrete business actions.",
      highlightTitle: "Quick profile",
      highlight1: "Business & data analytics",
      highlight2: "Power BI, SQL, Python",
      highlight3: "Lean, Agile, business requirements",
      highlight4: "Reporting automation"
    },
    skills: {
      title: "Skills",
      card1: { title: "Data analysis", body: "Data modeling, business statistics, trend analysis." },
      card2: {
        title: "Business Intelligence",
        body: "Power BI, KPI dashboards, automated executive reporting."
      },
      card3: {
        title: "Processes & communication",
        body: "Requirements gathering, process mapping, stakeholder collaboration."
      }
    },
    certs: {
      title: "Certificates",
      item1: "Advanced analytics and data visualization.",
      item2: "Agile project and team management.",
      item3: "Advanced queries and database optimization."
    },
    projects: {
      title: "Projects",
      cta: "Let’s talk about collaboration",
      more: "Learn more",
      p1: {
        title: "360° sales dashboard",
        body: "Interactive KPI report for sales teams, automated alerts, and customer segmentation."
      },
      p2: {
        title: "Operational cost optimization",
        body: "Cost analysis across five business areas, savings recommendations, and action roadmap."
      },
      p3: {
        title: "ESG reporting automation",
        body: "Multi-source data integration, data warehouse, and ESG reporting schedule."
      }
    },
    blog: {
      title: "Blog",
      frequency: "New post every two weeks",
      read: "Read post",
      post1: {
        title: "How to measure business process effectiveness?",
        body: "A set of metrics that connect operational data with strategic goals."
      },
      post2: {
        title: "Top 5 mistakes in executive dashboards",
        body: "The most common KPI report issues and how to fix them for better decisions."
      }
    },
    powerbi: {
      title: "Power BI - sample reports",
      body:
        "Below are public Power BI reports. The final version will be connected to live data sources and automatically refreshed."
    },
    contact: {
      title: "Contact",
      body: "Want to discuss a project or collaboration? Use the form or reach out directly.",
      form: {
        name: "Full name",
        email: "Email",
        topic: "Topic",
        message: "Message",
        submit: "Send message",
        note: "The form will send data to Google Sheets once the Google Apps Script endpoint is configured."
      }
    },
    projectPages: {
      back: "Back to homepage",
      overview: "Project overview",
      goals: "Goals & outcomes",
      tools: "Tools & stack",
      timeline: "Key milestones"
    },
    project1: {
      title: "360° sales dashboard",
      summary: "Comprehensive sales reporting solution for leadership and sales teams.",
      overview:
        "The dashboard consolidates data from CRM, sales systems, and marketing tools to provide a unified view of pipeline performance and margins across segments.",
      goals: [
        "Automated alerts for sales drops",
        "Customer segmentation by value",
        "Single source of truth for leadership"
      ],
      tools: ["Power BI", "SQL Server", "Azure Data Factory", "Excel"],
      timeline: ["Requirements workshops", "Data model & prototype", "Launch and trainings"]
    },
    project2: {
      title: "Operational cost optimization",
      summary: "Operational cost analysis across five business areas with savings recommendations.",
      overview:
        "The project identified cost drivers with the highest impact on financial results using ABC analysis and budget variance tracking.",
      goals: [
        "Identify high-cost areas",
        "Recommend savings initiatives",
        "Monitor results monthly"
      ],
      tools: ["Python", "Power BI", "SQL", "Miro"],
      timeline: ["Data collection", "Analysis and recommendations", "Implementation workshops"]
    },
    project3: {
      title: "ESG reporting automation",
      summary: "Automated ESG reporting pipeline for a capital group.",
      overview:
        "Implemented data intake from distributed systems and scheduled automated ESG reporting across the organization.",
      goals: [
        "Consistent ESG data across the group",
        "40% reduction in reporting time",
        "Audit-ready documentation"
      ],
      tools: ["Power BI", "Power Automate", "SQL", "SharePoint"],
      timeline: ["Source mapping", "ETL automation", "Team enablement sessions"]
    },
    blogPages: {
      back: "Back to homepage",
      readTime: "Read time: 5 min",
      tag: "Business analytics"
    },
    blog1: {
      title: "How to measure business process effectiveness?",
      intro:
        "Process effectiveness is more than cycle time. It includes quality, cost, and customer impact.",
      points: [
        "Define metrics aligned to business objectives.",
        "Connect operational data with customer feedback.",
        "Build reports that show root causes, not only outcomes."
      ]
    },
    blog2: {
      title: "Top 5 mistakes in executive dashboards",
      intro:
        "Executive dashboards should be clear and decision-oriented. Here are the most common mistakes.",
      points: [
        "Too many metrics in a single view.",
        "Lack of context and benchmarks.",
        "Outdated data without a refresh schedule."
      ]
    }
  }
};

const defaultLang = "pl";
const langToggle = document.querySelector("[data-lang-toggle]");
const elements = document.querySelectorAll("[data-i18n]");
const form = document.querySelector(".contact-form");

const formEndpoint = "YOUR_GOOGLE_APPS_SCRIPT_URL";

const setLanguage = (lang) => {
  const locale = translations[lang] ? lang : defaultLang;
  document.documentElement.lang = locale;
  elements.forEach((el) => {
    const key = el.dataset.i18n.split(".");
    let value = translations[locale];
    key.forEach((segment) => {
      if (value) {
        value = value[segment];
      }
    });
    if (value) {
      el.textContent = value;
    }
  });
  if (langToggle) {
    langToggle.textContent = locale === "pl" ? "EN" : "PL";
  }
  localStorage.setItem("portfolioLang", locale);
};

if (langToggle) {
  langToggle.addEventListener("click", () => {
    const current = localStorage.getItem("portfolioLang") || defaultLang;
    setLanguage(current === "pl" ? "en" : "pl");
  });
}

setLanguage(localStorage.getItem("portfolioLang") || defaultLang);

if (form) {
  form.action = formEndpoint;
  form.addEventListener("submit", (event) => {
    if (formEndpoint === "YOUR_GOOGLE_APPS_SCRIPT_URL") {
      event.preventDefault();
      alert(
        "Dodaj adres Google Apps Script w pliku scripts.js, aby formularz mógł wysyłać dane do Google Sheets."
      );
    }
  });
}
